package com.hs.ex1;

public class Computer extends Electronics{

	private String cpu;
	
	
	public String getCpu() {
		return cpu;
	}


	public void setCpu(String cpu) {
		this.cpu = cpu;
	}


	public Computer() {
		this.setCompany("Apple");
		this.setBrand("MackbookPro");
		this.setPrice(300);
		this.setPoint(50);
		this.setCpu("M1");
	}
	
	@Override
	public void info() {
		System.out.println("Company : "+this.getCompany());
		System.out.println("Brand : "+this.getBrand());
		System.out.println("CPU : "+this.getCpu());
		System.out.println("Price : "+this.getPrice());
		System.out.println("Point : "+this.getPoint());
		
	}
}
