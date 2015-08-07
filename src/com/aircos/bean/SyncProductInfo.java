package com.aircos.bean;

import java.util.ArrayList;

public class SyncProductInfo {
	
	private String customerCode;
	private ArrayList<Product> products;
	
	public SyncProductInfo() {
		super();
		// TODO Auto-generated constructor stub
		this.products = new ArrayList<Product>();
	}
	
	public String getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
}
