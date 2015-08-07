package com.aircos.bean;

public class Product {

//	<skuCode>TTYC43821K59160</skuCode>
////  <actionType>ADD-OW</actionType>
////  <name>Teeine WeeineTTYC43821K</name>
////  <category></category>
////  <barCode>TTYC43821K59160</barCode>
////  <weight>0.0000000</weight>
////  <unitPrice>0.0</unitPrice>
	private String skuCode;
	private String actionType;
	private String name;
	private String category;
	private String barCode;
	private Double weight;
	private Float unitPrice;
	
	
	public String getSkuCode() {
		return skuCode;
	}
	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Float unitPrice) {
		this.unitPrice = unitPrice;
	}
}
