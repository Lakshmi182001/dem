package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.productdetails.ProductDetails;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepo;

	@Override
	public List<ProductDetails> getAllproducts()
	{
		// TODO Auto-generated method stub
		List<ProductDetails> products = new ArrayList<>(); 
		userRepo.findAll().forEach(products1 -> products.add(products1));  
		return getAllproducts(); 
	}

	@Override
	public ProductDetails getproductById(Integer proid) {
	
		// TODO Auto-generated method stub
		return userRepo.findById(proid).get();  
	}

	@Override
	public long calculatePrice(int q, int p) {
		// TODO Auto-generated method stub
		ProductDetails productDetails= null;
		int amount = (productDetails.getQuantity())*(productDetails.getPrice());
		return amount;
	}
}	
	