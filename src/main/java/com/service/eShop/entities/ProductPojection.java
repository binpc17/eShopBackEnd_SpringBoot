package com.service.eShop.entities;

import com.service.eShop.entities.Product;
import org.springframework.data.rest.core.config.Projection;


@Projection(name = "P1",types = Product.class)
public interface ProductPojection {
    // Get the projection exemple LIKE this http://localhost:8087/products/projectionp=P1
    public double getPrice(); // this Methode is already exist in Product.class

}
