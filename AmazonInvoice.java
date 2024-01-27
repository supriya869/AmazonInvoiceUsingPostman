package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AmazonInvoice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CustomerId;
	private String cname;
	private long mobilenumber;
	private String productname;
	private double price;
	private int qunatity;
	private double total;
	private double discount;
	

	public AmazonInvoice() {
		super();
	}
	public AmazonInvoice(int customerId, String cname, long mobilenumber, String productname, double price,
			int qunatity) {
		super();
		CustomerId = customerId;
		this.cname = cname;
		this.mobilenumber = mobilenumber;
		this.productname = productname;
		this.price = price;
		this.qunatity = qunatity;
	}

	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQunatity() {
		return qunatity;
	}
	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}
	@Override
	public String toString() {
		return "AmazonInvoice [CustomerId=" + CustomerId + ", cname=" + cname + ", mobilenumber=" + mobilenumber
				+ ", productname=" + productname + ", price=" + price + ", qunatity=" + qunatity + ", total=" + total
				+ ", discount=" + discount + "]";
	}
	
	
	
	
	

}
