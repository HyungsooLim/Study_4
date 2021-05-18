package com.hs.ex1;

public class Tv extends Electronics{

	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public Tv() {
		this.setCompany("Samsung");
		this.setBrand("Sero");
		this.setPrice(500);
		this.setPoint(100);
		this.setSize(60);
	}
	
	@Override
	public void info() {
		System.out.println("Company : "+this.getCompany());
		System.out.println("Brand : "+this.getBrand());
		System.out.println("Size : "+this.getSize());
		System.out.println("Price : "+this.getPrice());
		System.out.println("Point : "+this.getCompany());
	}
}
