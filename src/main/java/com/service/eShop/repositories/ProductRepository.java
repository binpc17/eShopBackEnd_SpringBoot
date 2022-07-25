package com.service.eShop.repositories;

import com.service.eShop.entities.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin("*")
@RepositoryRestResource
public interface ProductRepository extends JpaRepository <Product, Long> {
    // to make this methode accessfull on REST API LIKE THIS http://localhost:8087/products/search/byDesignattion?mc=XX
    @RestResource(path = "/byDesignattions")
    public List<Product> findProductByDesignationContains(@Param("mc") String mc);
    //loadData BY Page Need to add >> Pageable LIKE THIS http://localhost:8087/products/search/byDesignattion?mc=XX&page=0&size=2
    @RestResource(path = "/byDesignattion")
    public List<Product> findProductByDesignationContains(@Param("mc") String mc, Pageable pageable);
}
