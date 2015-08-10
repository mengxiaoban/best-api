package com.aircos.bean;

import java.util.ArrayList;

public class SyncAsnInfo {
	private String customerCode;
	private String warehouseCode;
	private String asnCode;
	private String actionType;
	private String extTradeId;
	private String extOrderType;
	private String note;
	private String businessType;
	private String udfFlag;
	private String udf1;
	private String udf2;
	private String udf3;
	private String udf4;
	private String udf5;
	private String udf6;
	private String udf7;
	private String udf8;
	
	private ArrayList<AsnItem> items;
	private ArrayList<UniqueNO> uniqueNumbers;
	
	private Sender sender;
	private LpnInfo lpnInfo;
	private LpnDetail lpnDetail;
}
