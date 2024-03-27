package com.luiz.dtime.Model.customer;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String about;

    public Customer(NewCustomerDTO customerDTO){
        this.name = customerDTO.name();
        this.about = customerDTO.about();
    }





}
