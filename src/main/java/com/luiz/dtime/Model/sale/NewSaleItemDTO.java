package com.luiz.dtime.Model.sale;

import com.luiz.dtime.Model.product.Product;

public record NewSaleItemDTO(Product product,
                             double receivedValue
                             ) {
}
