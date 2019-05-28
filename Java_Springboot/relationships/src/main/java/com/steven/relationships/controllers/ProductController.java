package com.steven.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.steven.relationships.models.Category;
import com.steven.relationships.models.Dojo;
import com.steven.relationships.models.Person;
import com.steven.relationships.models.Product;
import com.steven.relationships.services.CategoryService;
import com.steven.relationships.services.ProductService;

@Controller
public class ProductController {
	private final ProductService productService;
	private final CategoryService categoryService;
	
	  public ProductController(ProductService productService, CategoryService categoryService) {
	        this.productService = productService;
	        this.categoryService = categoryService;
		    }
	  
	    
		//FIRST DISPLAY ADD NEW PROD
		@RequestMapping("/products/new")
		public String addNew(@ModelAttribute("product") Product product, Model model) {
			return "/persons/newProduct.jsp";
		}
		
	    // CREATES NEW PROD
	    @RequestMapping(value="/products/new", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("product") Product product, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/persons/newProduct.jsp";
	        } else {
	            productService.createProduct(product);

//	            return "redirect:/persons/dojo.jsp";
	            return "redirect:/products/new";
	        }
	    }
	    
	    
	   	    
	    
		//FIRST DISPLAY ADD NEW Category
		@RequestMapping("/categories/new")
		public String addNews(@ModelAttribute("category") Category category, Model model) {
			return "/persons/newCategory.jsp";
		}
		
	    // CREATES NEW PROD
	    @RequestMapping(value="/categories/new", method=RequestMethod.POST)
	    public String creates(@Valid @ModelAttribute("category") Category category, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/persons/newCategory.jsp";
	        } else {
	            categoryService.createCategory(category);

//	            return "redirect:/persons/dojo.jsp";
	            return "redirect:/categories/new";
	        }
	    }
	    
	    //display each dojo info
	    @RequestMapping("products/{id}")
	    public String displayinfo(@PathVariable("id")Long id, Model model) {
	    Product myProd = productService.getOneById(id);
		List<Category> categorylist = categoryService.allCategories();
		model.addAttribute("categorylist", categorylist);
//		model.addAttribute("myProd", myProd);
		
		
		for (int i = 0; i < categorylist.size(); i++) {
			System.out.println(categorylist.get(i).getName());
		}
		
	    model.addAttribute("product",myProd);
//	    model.addAttribute("ninjas", myDojo.getNinjas());

	    return "/persons/products.jsp";
	    }
	    
	    
	        
		
		
}
