package com.luiz.dtime.Controller;

import com.luiz.dtime.Model.product.NewProductDTO;
import com.luiz.dtime.Model.product.Product;
import com.luiz.dtime.Model.product.ReadProductDTO;
import com.luiz.dtime.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProductController {
    @Autowired
    ProductRepository repository;

    @GetMapping
    public Page<ReadProductDTO> findAllProducts(@PageableDefault (size = 10)Pageable page){
        return repository.findAll(page).map(ReadProductDTO::new);
    }
    @PostMapping("/novo")
    public void saveProduct(@RequestBody NewProductDTO p) {
        repository.save(new Product(p));
    }



}
