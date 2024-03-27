package com.luiz.dtime.Repository;

import com.luiz.dtime.Model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
