package com.luiz.dtime.Model.purchase;

import com.luiz.dtime.Model.product.Product;

public record ReadPurchaseItemDTO(Product product,
                                  double price,
                                  double tax,
                                  double deliveryTax,
                                  double totalCost
                                  ) {
    public ReadPurchaseItemDTO(PurchaseItem item){
        this(item.getProduct(), item.getPrice(), item.getTax(), item.getDeliveryTax(), item.getTotalCost());
    }
}
