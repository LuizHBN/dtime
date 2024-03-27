package com.luiz.dtime.Model.sale;

import java.util.Date;

public record ReadSaleDTO(Date date,
                          String customerName,
                          double totalValue) {
    public ReadSaleDTO(Sale sale){
        this(sale.getDate(), sale.getCustomer().getName(), sale.getTotalValue());
    }
}
