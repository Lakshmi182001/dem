package com.example.demo.controller;
//ADMIN

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.productdetails.ProductDetails;
import com.example.demo.service.AdminService;
import com.example.demo.service.AdminService;
 
//mark class as Controller  
@RestController  
@RequestMapping("/admin")
public class AdminController {
		@Autowired
		private AdminService service;		
		@RequestMapping("/test")
		public String tests(){
			return "Test product Controller";
		}
		
		@GetMapping("/products")  
		public List<ProductDetails> getAllBooks() 	{  
		return service.getAllproducts();  
		}  
		
		@GetMapping("/products/{productid}")  
		public ProductDetails getprodByName(@PathVariable(value="productid") Integer proid) {  
		return service.getproductById(proid);  
		}  
	
		@DeleteMapping("/products/delete/{productid}")  
		public String deleteproduct(@PathVariable(value="productid") Integer productid) 		{  
		service.deleteproductById(productid);  
		return "Successfully deleted the product : '"+productid+"'";
		}  
			
		 
		@PostMapping("/products/add")  
		public ProductDetails saveproduct(@RequestBody ProductDetails products)	{  
		return service.saveproduct(products); 		 
		} 
		
		@PutMapping("/products/update/{productid}")  
		private ProductDetails update(@PathVariable(value="productid") Integer productid, @RequestBody ProductDetails products)  	{  
		return service.updateproduct(productid,products);
		}  				
	 
		@DeleteMapping("/products")  
		private String deleteproduct() {  
		service.deleteList();  
		return "Successfully deleted the product ";
		}  
		}

