package com.luiz.dtime.Model.customer;

public record ReadCustomerDTO(Long id,
        String name,
        String about ) {

    public ReadCustomerDTO(Customer customer){
        this(customer.getId(), customer.getName(), customer.getAbout());
    }
}
