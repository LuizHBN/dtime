package com.luiz.dtime.Model.purchase;

public record NewPurchaseItemDTO(double price,
                                 double tax,
                                 double deliveryTax,
                                 double totalCost) {
}
