package com.example.demo.service;


import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.productdetails.ProductDetails;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private UserRepository userRepo;	
	
	public AdminServiceImpl(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public ProductDetails saveproduct(ProductDetails b) {
		return userRepo.save(b);
		
	}

	@Override
	public List<ProductDetails> getAllproducts()   
	{  
	List<ProductDetails> products = new ArrayList<>();  
	userRepo.findAll().forEach(products1 -> products.add(products1));  
	return products;  
	}  

	/*
	 * @Override public BookDetails getBookByName(String Bname) {
	 * Optional<BookDetails> bk = userRepo.findById(Bname); BookDetails bookDetails
	 * = null; if (bk.isPresent()) { bookDetails = bk.get(); } else { throw new
	 * RuntimeException(" Book not found for id :: " + Bname); } return bookDetails;
	 * }
	 */
	/*
	 * public BookDetails getBookByName(String Bname) { return
	 * userRepo.findById(Bname).get(); }
	 * 
	 * @Override public void deleteBookByName(String Bname) {
	 * userRepo.deleteById(Bname);
	 * 
	 * }
	 */

	/*@Override
	public ProductDetails updateproduct(Integer proid,ProductDetails b) {
		ProductDetails old = getBookByCode(Bcode);
		old.setBookCode(b.getBookCode());
		old.setBookType(b.getBookType());
		old.setBookName(b.getBookName());
		old.setQuantity(b.getQuantity());
		old.setPrice(b.getPrice());		
		return userRepo.save(old);
	}*/
@Override
	public ProductDetails updateproduct(Integer proid, ProductDetails b) {
		// TODO Auto-generated method stub
		
			ProductDetails old = getproductByCode(proid);
			old.setProductid(b.getProductid());
			old.setProductname(b.getProductname());
			old.setDescription(b.getDescription());
			old.setQuantity(b.getQuantity());
			old.setPrice(b.getPrice());		
			return userRepo.save(old);
	
	}

	/*@Override
	public ProductDetails saveBook(ProductDetails b) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public ProductDetails getproductById(int proid) {
		// TODO Auto-generated method stub
		return userRepo.findById(proid).get();
	}

	@Override
	public void deleteproductById(Integer proid) {
		// TODO Auto-generated method stub
		userRepo.deleteById(proid);	
	}

	@Override
	public List<ProductDetails> deleteList() {
		// TODO Auto-generated method stub
		List<ProductDetails> products = new ArrayList<>();  
		userRepo.deleteAllInBatch(); 
		return products; 
		
	}

	@Override
	public ProductDetails saveBook(ProductDetails b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDetails getproductBycode(int proid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteproductBycode(Integer proid) {
		// TODO Auto-generated method stub
		
	}

	
}