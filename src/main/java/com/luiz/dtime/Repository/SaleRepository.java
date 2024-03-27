package com.luiz.dtime.Repository;

import com.luiz.dtime.Model.sale.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
