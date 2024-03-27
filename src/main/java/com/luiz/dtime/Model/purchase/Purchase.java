package com.luiz.dtime.Model.purchase;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.LastModifiedBy;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "purchases")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Double total;
    private boolean delivered;

    public Purchase(NewPurchaseDTO purchaseDTO){
        this.setDate(purchaseDTO.date());
        this.setTotal(purchaseDTO.total());
    }
}
