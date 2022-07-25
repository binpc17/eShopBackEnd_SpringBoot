package com.service.eShop;

import com.service.eShop.entities.Product;
import com.service.eShop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
public class EShopApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EShopApplication.class, args);
	}
	@Autowired
	private ProductRepository productRepository;
	// Expose OR display ID of an object (entities) THEN CALL this >> RepositoryRestConfiguration
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	// Test the app on Startup...
	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Product.class);
		productRepository.save(new Product(null,"Lenovo XL200",67500,3));
		productRepository.save(new Product(null,"HP EliteBook",450,30));
		productRepository.save(new Product(null,"HP dev6",350,24));
		productRepository.save(new Product(null,"Sum SUng Galaxi 9",950,10));
		productRepository.save(new Product(null,"Lenovo V2 XL200",67500,3));
		productRepository.save(new Product(null,"HP EliteBook V2",450,30));
		productRepository.save(new Product(null,"HP dev66",350,24));
		productRepository.save(new Product(null,"Sum SUng Galaxi 999",950,10));

		// real All Product
		productRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		});

	}




}
