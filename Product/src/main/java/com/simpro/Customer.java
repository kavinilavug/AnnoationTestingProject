package com.simpro;


public class Customer {
	private String cusName;
    private int cusId;
   
    public Customer(String cusName, int cusId) {
		super();
		this.cusName = cusName;
		this.cusId = cusId;
	}
	public void customerDetails() {
    	System.out.println("Customer Id:"+cusId);
    	System.out.println("Customer Name:"+cusName);
        
    }
}
