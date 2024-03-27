package com.luiz.dtime.Repository;

import com.luiz.dtime.Model.sale.SaleItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleItemRepository extends JpaRepository<SaleItem,Long> {
}
