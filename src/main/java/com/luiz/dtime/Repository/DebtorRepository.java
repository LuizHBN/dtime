package com.luiz.dtime.Repository;

import com.luiz.dtime.Model.debtor.Debtor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebtorRepository extends JpaRepository<Debtor, Long> {
}
