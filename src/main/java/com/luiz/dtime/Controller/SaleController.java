package com.luiz.dtime.Controller;

import com.luiz.dtime.Model.purchase.NewPurchaseItemDTO;
import com.luiz.dtime.Model.purchase.Purchase;
import com.luiz.dtime.Model.purchase.PurchaseItem;
import com.luiz.dtime.Model.sale.*;
import com.luiz.dtime.Repository.SaleItemRepository;
import com.luiz.dtime.Repository.SaleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class SaleController {

    private final SaleRepository saleRepository;
    private final SaleItemRepository itemRepository;

    @Autowired
    public SaleController(SaleRepository saleRepository, SaleItemRepository ItemRepository){
        this.saleRepository = saleRepository;
        this.itemRepository = ItemRepository;
    }
    @GetMapping
    public Page<ReadSaleDTO> findAllSales(Pageable page){
        return saleRepository.findAll(page).map(ReadSaleDTO :: new);
    }
    @PostMapping("/nova")
    @Transactional
    public void saveSale(@RequestBody NewSaleDTO saleDTO){
        var sale = new Sale(saleDTO);
        saleRepository.save(sale);

        for(NewSaleItemDTO item : saleDTO.items()){
            itemRepository.save(new SaleItem(item,sale));
        }


    }
}
