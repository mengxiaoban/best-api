package com.aircos.test;

import java.util.ArrayList;

import com.aircos.bean.Product;
import com.aircos.bean.SyncProductInfo;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/***
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<SyncAsnInfo>
    <customerCode>85000236</customerCode>
    <warehouseCode>EC_GZ_SJ</warehouseCode>
    <asnCode>CPYCD14009702</asnCode>
    <actionType>ADD</actionType>
    <extTradeId>CPYCD14009702</extTradeId>
    <extOrderType>Phd</extOrderType>
    <note></note>
    <sender>
        <name>茵曼旗舰店</name>
        <postalCode>510000</postalCode>
        <province>广东</province>
        <city>广州</city>
        <shippingAddress>广东省广州市番禺区石基镇石岗东村石岗南路58号茵曼仓库</shippingAddress>
    </sender>
    <businessType>大货收货</businessType>
    <udfFlag>true</udfFlag>
    <udf1>510000</udf1>
    <udf4>CPYCD14009702</udf4>
    <udf8>大货收货</udf8>
    <items>
        <item>
            <itemSkuCode>6932838000911</itemSkuCode>
            <itemName>长袖T恤</itemName>
            <itemQuantity>117</itemQuantity>
            <itemNote></itemNote>
            <lineNo>10</lineNo>
            <udfFlag>true</udfFlag>
            <udf6>20140624014</udf6>
            <udf7>虎门欧特梦</udf7>
            <udf8>FOBCG14008854</udf8>
            <purchaseContractNo>20140624014</purchaseContractNo>
            <supplierName>虎门欧特梦</supplierName>
            <purchaseOrderNo>FOBCG14008854</purchaseOrderNo>
        </item>
        <item>
            <itemSkuCode>6932838000928</itemSkuCode>
            <itemName>长袖T恤</itemName>
            <itemQuantity>116</itemQuantity>
            <itemNote></itemNote>
            <lineNo>11</lineNo>
            <udfFlag>true</udfFlag>
            <udf6>20140624014</udf6>
            <udf7>虎门欧特梦</udf7>
            <udf8>FOBCG14008854</udf8>
            <purchaseContractNo>20140624014</purchaseContractNo>
            <supplierName>虎门欧特梦</supplierName>
            <purchaseOrderNo>FOBCG14008854</purchaseOrderNo>
        </item>
        <item>
            <itemSkuCode>6932838000966</itemSkuCode>
            <itemName>长袖T恤</itemName>
            <itemQuantity>118</itemQuantity>
            <itemNote></itemNote>
            <lineNo>15</lineNo>
            <udfFlag>true</udfFlag>
            <udf6>20140624014</udf6>
            <udf7>虎门欧特梦</udf7>
            <udf8>FOBCG14008854</udf8>
            <purchaseContractNo>20140624014</purchaseContractNo>
            <supplierName>虎门欧特梦</supplierName>
            <purchaseOrderNo>FOBCG14008854</purchaseOrderNo>
        </item>
    </items>
</SyncAsnInfo>

**/ 
public class TestSyncProductInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XStream xstream = new XStream(new DomDriver("utf8"));
		
		
		xstream.alias("SyncProductInfo", SyncProductInfo.class);
		xstream.alias("Product", Product.class);
		
//		Person joe = new Person("Joe", "Walnes");
//		joe.setPhone(new PhoneNumber(123, "1234-456"));
//		joe.setFax(new PhoneNumber(123, "9999-999"));
//		
//		Person joe2 = new Person("Sang", "sang");
//		joe2.setPhone(new PhoneNumber(123, "1234-456"));
//		joe2.setFax(new PhoneNumber(123, "9999-999"));
//		
//		Persons  p = new Persons();
//		
//		ArrayList list = new ArrayList();
//		list.add(joe);
//		list.add(joe2);
//		
//		p.setPersons(list);
		
		SyncProductInfo info = new SyncProductInfo();
		info.setCustomerCode("sangshilong-customer");
		
		Product p1 = new Product();
		p1.setName("sss");
		p1.setSkuCode("TTYC43821K59160");
		
		Product p2 = new Product();
		p2.setName("bbb");
		p2.setSkuCode("TTYC43821K56165");
		
		info.getProducts().add(p1);
		info.getProducts().add(p2);
		
		String xml = xstream.toXML(info);
		
		System.out.println(xml);
	}

}
