package com.ibtech.source;

public class MyBean {
	
	private long myId;
	private String myName;
	private double myValue;
	
	
	public MyBean() {
	}


	public MyBean(long myId, String myName, double myValue) {
		this.myId = myId;
		this.myName = myName;
		this.myValue = myValue;
	}


	public long getMyId() {
		return myId;
	}


	public void setMyId(long myId) {
		this.myId = myId;
	}


	public String getMyName() {
		return myName;
	}


	public void setMyName(String myName) {
		this.myName = myName;
	}


	public double getMyValue() {
		return myValue;
	}


	public void setMyValue(double myValue) {
		this.myValue = myValue;
	}
	
	
	
	
}
