package com.m2i.formation.jsf.managedBeans;

import javax.faces.bean.ManagedBean;

@ManagedBean (name = "simpleBean")
public class SimpleBean {
	
	private int myInt;
	private String myString;
	
	
	public SimpleBean(){
		myInt = 3;
		myString = "I'm fine thanks";
	}

	public int getMyInt() {
		return myInt;
	}

	public void setMyInt(int myInt) {
		this.myInt = myInt;
	}

	public String getMyString() {
		return myString;
	}

	public void setMyString(String myString) {
		this.myString = myString;
	}

}
