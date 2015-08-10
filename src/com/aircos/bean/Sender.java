package com.aircos.bean;

/**
 //	name
 //	postalCode
 //	phoneNumber
 //	mobileNumber
 //	province
 //	city
 //	district
 //	shippingAddress
 //	email

  
  <sender>
        <name>茵曼旗舰店</name>
        <postalCode>510000</postalCode>
        <province>广东</province>
        <city>广州</city>
        <shippingAddress>广东省广州市番禺区石基镇石岗东村石岗南路58号茵曼仓库</shippingAddress>
    </sender>
    
    
  * - 属性已全
  *
  **/
public class Sender {
	private String name;
	private String postalCode;
	private String phoneNumber;
	private String mobileNumber;
	
	private String province;
	private String city;
	private String district;
	private String shippingAddress;
	
	private String email;
	
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
}
