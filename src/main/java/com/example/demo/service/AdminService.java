package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.productdetails.ProductDetails;

@Service
public interface AdminService {
	ProductDetails saveBook(ProductDetails b);
	List<ProductDetails> getAllproducts();
	//BookDetails getBookByName(String Bname);
	ProductDetails getproductById(int proid);
	ProductDetails updateproduct(Integer proid,ProductDetails b );
	void deleteproductById(Integer proid);
	List<ProductDetails> deleteList();
	ProductDetails saveproduct(ProductDetails b);
}