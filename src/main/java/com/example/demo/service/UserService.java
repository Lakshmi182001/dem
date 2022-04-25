package com.example.demo.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.productdetails.ProductDetails;

@Service
public interface UserService {
	List<ProductDetails> getAllproducts();
	ProductDetails getproductById(Integer proid);
	long calculatePrice(int q,int p);
}
