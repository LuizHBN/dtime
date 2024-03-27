package com.luiz.dtime.Model.product;

public record ReadProductDTO(Long id,
                             String description) {

    public ReadProductDTO(Product product){
       this(product.getId(), product.getDescription());
    }
}
