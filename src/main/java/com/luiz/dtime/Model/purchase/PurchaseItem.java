package com.luiz.dtime.Model.purchase;

import com.luiz.dtime.Model.product.Product;
import com.luiz.dtime.Model.purchase.Purchase;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "purchase_itens")
public class PurchaseItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "purchase_id", nullable = false)
    private Purchase purchase;
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
    private double price;
    private double tax;
    private double deliveryTax;
    private double totalCost;

    public PurchaseItem(NewPurchaseItemDTO purchaseItemDTO, Purchase purchase){
        this.setPurchase(purchase);
        this.setPrice(purchaseItemDTO.price());
        this.setTax(purchaseItemDTO.tax());
        this.setDeliveryTax(purchaseItemDTO.deliveryTax());
        this.setTotalCost(purchaseItemDTO.totalCost());

    }



}
