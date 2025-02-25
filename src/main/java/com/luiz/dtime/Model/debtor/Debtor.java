package com.luiz.dtime.Model.debtor;

import com.luiz.dtime.Model.purchase.Purchase;
import com.luiz.dtime.Model.sale.Sale;
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
@Table(name = "debtors")
public class Debtor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "purchase_id", nullable = false)
    private Purchase purchase;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "sale_id", nullable = false)
    private Sale sale;
    private Date payday_1;
    private Date payday_2;
    private double totalValue;
    private double remainingValue;


}
