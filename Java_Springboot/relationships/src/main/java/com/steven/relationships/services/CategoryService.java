package com.steven.relationships.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.steven.relationships.models.Category;
import com.steven.relationships.models.Product;
import com.steven.relationships.repositories.CategoryRepo;


@Service
public class CategoryService {
	private final CategoryRepo categoryRepo;

	  public CategoryService(CategoryRepo categoryRepo) {
	        this.categoryRepo = categoryRepo;
	    }
	  
	    // LIST ALL Products
	    public List<Category> allCategories() {
	        return categoryRepo.findAll();
	    }
	    
  	public Category createCategory(Category b) {
  		return categoryRepo.save(b);
  }

	
}