package com.steven.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.steven.relationships.models.Dojo;
import com.steven.relationships.models.Product;
import com.steven.relationships.repositories.ProductRepo;


@Service
public class ProductService {
	private final ProductRepo productRepo;

	  public ProductService(ProductRepo productRepo) {
	        this.productRepo = productRepo;
	    }
	  
	    // LIST ALL Products
	    public List<Product> allProducts() {
	        return productRepo.findAll();
	    }
	    
  	public Product createProduct(Product b) {
  		return productRepo.save(b);
  }
  	
	//FIND ONE SINGLE Product
	public Product getOneById(Long id) {
        Optional<Product> optionalProduct = productRepo.findById(id);
        if(optionalProduct.isPresent()) {
            return optionalProduct.get();
        } else {
            return null;
        }
	}

  
	
}
