//package com.aircos.bean;
//
//import java.util.ArrayList;
//
//import com.aircos.bean.Product;
//import com.aircos.bean.SyncProductInfo;
//import com.thoughtworks.xstream.XStream;
//import com.thoughtworks.xstream.io.xml.DomDriver;
//
//public class TestSyncProductInfo {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		XStream xstream = new XStream(new DomDriver("utf8"));
//		
//		
//		xstream.alias("SyncProductInfo", SyncProductInfo.class);
//		xstream.alias("Product", Product.class);
//		
////		Person joe = new Person("Joe", "Walnes");
////		joe.setPhone(new PhoneNumber(123, "1234-456"));
////		joe.setFax(new PhoneNumber(123, "9999-999"));
////		
////		Person joe2 = new Person("Sang", "sang");
////		joe2.setPhone(new PhoneNumber(123, "1234-456"));
////		joe2.setFax(new PhoneNumber(123, "9999-999"));
////		
////		Persons  p = new Persons();
////		
////		ArrayList list = new ArrayList();
////		list.add(jjoe);
////		list.add(joe2);
////		
////		p.setPersons(list);
//		
//		SyncProductInfo info = new SyncProductInfo();
//		info.setCustomerCode("sangshilong-customer");
//		
//		Product p1 = new Product();
//		p1.setName("sss");
//		p1.setSkuCode("TTYC43821K59160");
//		
//		Product p2 = new Product();
//		p2.setName("bbb");
//		p2.setSkuCode("TTYC43821K56165");
//		
//		info.getProducts().add(p1);
//		info.getProducts().add(p2);
//		
//		String xml = xstream.toXML(info);
//		
//		System.out.println(xml);
//	}
//
//}
