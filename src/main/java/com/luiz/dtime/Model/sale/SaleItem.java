package com.luiz.dtime.Model.sale;

import com.luiz.dtime.Model.product.Product;
import com.luiz.dtime.Model.sale.Sale;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

@Entity
public class SaleItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn (name = "sale_id")
    private Sale sale;
    @ManyToOne
    @JoinColumn (name = "product_id")
    private Product product;
    private double receivedValue;

    public SaleItem(NewSaleItemDTO saleItemDTO, Sale sale){
        this.setSale(sale);
        this.setProduct(saleItemDTO.product());
        this.setReceivedValue(saleItemDTO.receivedValue());
    }
}
