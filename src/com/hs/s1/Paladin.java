package com.hs.s1;

public class Paladin extends Character{
	
	private Item item;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Paladin() {
		super(); // 기본적으로 생략되어 있음
		
	}
	
	public void prn() {
		System.out.println("Super : "+super.toString());
		System.out.println("This : "+this.toString());
	}
	
	public void info() {
		
	}
}
