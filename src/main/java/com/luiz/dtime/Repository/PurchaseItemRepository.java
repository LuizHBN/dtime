package com.luiz.dtime.Repository;

import com.luiz.dtime.Model.purchase.Purchase;
import com.luiz.dtime.Model.purchase.PurchaseItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PurchaseItemRepository extends JpaRepository<PurchaseItem, Long> {
    @Query("SELECT pi FROM PurchaseItem pi WHERE pi.purchase = :purchase")
    Page<PurchaseItem> findAllByPurchase(Purchase purchase, Pageable page);
}
