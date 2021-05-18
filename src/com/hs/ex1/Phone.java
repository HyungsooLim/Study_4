package com.hs.ex1;

public class Phone extends Electronics{

	private String network;
	
	
	public String getNetwork() {
		return network;
	}


	public void setNetwork(String network) {
		this.network = network;
	}


	public Phone() {
		this.setCompany("Apple");
		this.setBrand("Pro");
		this.setNetwork("5G");
		this.setPrice(150);
		this.setPoint(10);
	}
	
	@Override
	public void info() {
		System.out.println("Company : "+this.getCompany());
		System.out.println("Brand : "+this.getBrand());
		System.out.println("Network : "+this.getNetwork());
		System.out.println("Price : "+this.getPrice());
		System.out.println("Point : "+this.getCompany());
		
	}
}
