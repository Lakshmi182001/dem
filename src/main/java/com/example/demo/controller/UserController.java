package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.productdetails.ProductDetails;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;
	
	@GetMapping("/products")  
	public List<ProductDetails> getAllproducts()	{  
	return service.getAllproducts();  
	}  
	
	@GetMapping("/products/{productid}")  
	public ProductDetails getproducts(@PathVariable(value="productid") Integer productid)	{  
	return service.getproductById(productid);  
	}
	
	
}
