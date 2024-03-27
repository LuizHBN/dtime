package com.luiz.dtime.Controller;

import com.luiz.dtime.Model.sale.*;
import com.luiz.dtime.Repository.SaleItemRepository;
import com.luiz.dtime.Repository.SaleRepository;
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
    public void saveSale(@RequestBody NewSaleDTO saleDTO, @RequestBody List<NewSaleItemDTO> saleItemDTO){
        var sale = new Sale(saleDTO);
        saleRepository.save(sale);

        for (NewSaleItemDTO item : saleItemDTO){
            itemRepository.save(new SaleItem(item,sale));
        }

    }
}
