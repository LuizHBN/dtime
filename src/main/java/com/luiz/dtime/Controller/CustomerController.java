package com.luiz.dtime.Controller;

import com.luiz.dtime.Model.customer.Customer;
import com.luiz.dtime.Model.customer.NewCustomerDTO;
import com.luiz.dtime.Model.customer.ReadCustomerDTO;
import com.luiz.dtime.Repository.CustomerRepository;
import com.luiz.dtime.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class CustomerController {

    private final CustomerRepository repository;

    @Autowired
    public CustomerController(CustomerRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public Page<ReadCustomerDTO> findAllCustomers(@PageableDefault(size = 10) Pageable page){
        return repository.findAll(page).map(ReadCustomerDTO :: new);
    }

    @PostMapping("/novo")
    public void saveCustomer(@RequestBody NewCustomerDTO customerDTO) {
        repository.save(new Customer(customerDTO));
    };



}
