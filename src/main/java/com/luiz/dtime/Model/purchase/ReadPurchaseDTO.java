package com.luiz.dtime.Model.purchase;

import com.luiz.dtime.Model.product.ReadProductDTO;

import java.util.Date;
import java.util.List;

public record ReadPurchaseDTO(Date date,
                              double total
                            ) {
    public ReadPurchaseDTO(Purchase purchase){
        this(purchase.getDate(), purchase.getTotal());
    }
}
