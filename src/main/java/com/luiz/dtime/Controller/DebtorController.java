package com.luiz.dtime.Controller;

import com.luiz.dtime.Model.debtor.ReadDebtorDTO;
import com.luiz.dtime.Repository.DebtorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devedores")
public class DebtorController {
    private final DebtorRepository repository;
    @Autowired
    public DebtorController(DebtorRepository repository){
        this.repository = repository;
    }
    @GetMapping
    public Page<ReadDebtorDTO> findAllDebtors (Pageable page){
        return repository.findAll(page).map(ReadDebtorDTO :: new);
    }
}
