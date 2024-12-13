package com.study.estudospringboot.controllers;

import com.study.estudospringboot.dto.ProductsRecordDTO;
import com.study.estudospringboot.models.ProductModel;
import com.study.estudospringboot.repositories.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ProductController {
    @Autowired
    ProductRepository repository;

    @PostMapping("/api/products")
    public ResponseEntity<ProductModel> saveProduct(@RequestBody @Validated ProductsRecordDTO productsRecordDTO){
        var productModel = new ProductModel();
        BeanUtils.copyProperties(productsRecordDTO, productModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(productModel));
    }

    @GetMapping("api/products")
    public List<ProductModel> getProduct(){
        return repository.findAll();
    }

}
