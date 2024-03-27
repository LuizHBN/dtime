package com.luiz.dtime.Repository;

import com.luiz.dtime.Model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
