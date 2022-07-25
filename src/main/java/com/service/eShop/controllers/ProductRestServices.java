package com.service.eShop.controllers;

import com.service.eShop.entities.Product;
import com.service.eShop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin("*")
@RestController
public class ProductRestServices {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping(value = "/productList")
    public List<Product> productList (){
    return productRepository.findAll();
    }
    @GetMapping(value = "/productList/{id}")
    public Product productList (@PathVariable(name="id") Long idProduct){
        return productRepository.findById(idProduct).get();
    }

    @PutMapping(value = "/productList/{id}")
    public Product updateProduct (@PathVariable(name="id") Long idProduct, @RequestBody Product p){
        p.setId(idProduct);
        return productRepository.save(p);
    }

    @PostMapping(value = "/productList/")
    public Product saveProduct (@RequestBody Product p){
        return productRepository.save(p);
    }

    @DeleteMapping(value = "/productList/{id}")
    public void deleteProduct (@PathVariable(name="id") Long idProduct){
        productRepository.deleteById(idProduct);
    }
}
