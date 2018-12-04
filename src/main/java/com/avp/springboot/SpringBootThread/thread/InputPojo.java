package com.avp.springboot.SpringBootThread.thread;

import java.util.Map;

public class InputPojo {
	
	String operationName;
	Map<String,Object> data;
	
	public String getOperationName() {
		return operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}

}
