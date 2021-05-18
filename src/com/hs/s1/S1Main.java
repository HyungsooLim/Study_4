package com.hs.s1;

public class S1Main {

	public static void main(String[] args) {

		
		Mage mage = new Mage();
		mage.info();
		Paladin paladin = new Paladin();
		paladin.info();
		
		mage.getStaff().attack();
		
		Sword sword = new Sword();
		Staff staff = new Staff();
		mage.setStaff(staff);
		
		paladin.setItem(staff);
		paladin.setItem(sword);
		
//		System.out.println("------------------------");
//		mage.setName("카드가");
//		mage.setHp(100);
//		mage.setLevel(60);
//		mage.setMp(200);
//		mage.info();
//		System.out.println("------------------------");
//		Hunter hunter = new Hunter();
//		hunter.setName("렉사르");
//		hunter.setHp(150);
//		hunter.setLevel(60);
//		hunter.setMp(100);
//		hunter.info();
//		System.out.println("------------------------");
//		paladin.prn();
		
		//Character character = new Character();
	}
}
