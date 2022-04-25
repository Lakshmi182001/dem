package com.example.demo.productdetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class ProductDetails {
	@Id
	int productid;
	String productname;
	String description;
	int quantity;
	int price;
	public ProductDetails() {
		super();
	}
	
	public ProductDetails(int productid, String productname, String description, int quantity, int price) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}

	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDetails [productid=" + productid + ", productname=" + productname + ", description="
				+ description + ", quantity=" + quantity + ", price=" + price + "]";
	}
}