package com.luiz.dtime.Model.purchase;

import com.luiz.dtime.Model.product.Product;
import jakarta.validation.constraints.NotNull;

public record NewPurchaseItemDTO(@NotNull Product product,
                                 @NotNull double price,
                                 @NotNull double tax,
                                 @NotNull double deliveryTax,
                                 @NotNull double totalCost) {
}
