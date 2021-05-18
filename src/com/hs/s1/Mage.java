package com.hs.s1;

public class Mage extends Magic {

	private Staff staff
	;
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	//마법사
	//info
	public void info() {
		System.out.println("overriding");
	}
}
