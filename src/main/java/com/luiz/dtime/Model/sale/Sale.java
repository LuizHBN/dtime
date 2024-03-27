package com.luiz.dtime.Model.sale;

import com.luiz.dtime.Model.customer.Customer;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "sales")
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    private double totalValue;

    public Sale(NewSaleDTO saleDTO){
        this.setDate(saleDTO.date());
        this.setCustomer(saleDTO.customer());
        this.setTotalValue(saleDTO.totalValue());
    }


}
