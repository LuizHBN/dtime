package com.luiz.dtime.Controller;

import com.luiz.dtime.Model.purchase.*;
import com.luiz.dtime.Repository.PurchaseItemRepository;
import com.luiz.dtime.Repository.PurchaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/compra")
public class PurchaseController {
    private final PurchaseRepository purchaseRepository;
    private final PurchaseItemRepository itemRepository;

    public PurchaseController(PurchaseRepository purchaseRepository, PurchaseItemRepository itemRepository){
        this.purchaseRepository = purchaseRepository;
        this.itemRepository = itemRepository;
    }
    @GetMapping
    public Page<ReadPurchaseDTO> findAllPurchases(Pageable page){
       return purchaseRepository.findAll(page).map(ReadPurchaseDTO :: new);
    }
    @GetMapping("/detalhes")
    public ReadPurchaseAndItensDTO findAllItensByPurchase(@RequestBody Purchase purchase, Pageable page){
        Page<ReadPurchaseItemDTO> purchaseItems = itemRepository.findAllByPurchase(purchase, page)
                .map(ReadPurchaseItemDTO::new);

        return  new ReadPurchaseAndItensDTO(
                purchase,
                purchase.getDate(),
                purchase.getTotal(),
                purchase.isDelivered(),
                purchaseItems
        );

    }


    @PostMapping("/nova")
    @Transactional
    public void savePurchase(@RequestBody NewPurchaseDTO purchaseDTO){
        var purchase = new Purchase(purchaseDTO);
        purchaseRepository.save(purchase);

        for(NewPurchaseItemDTO item : purchaseDTO.items()){
            itemRepository.save(new PurchaseItem(item,purchase));
        }

    }
}
