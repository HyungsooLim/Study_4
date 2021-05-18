package com.hs.ex1;

public class Customer {

	private int money;
	private int point;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}


	public void buy(Electronics electronics) {

		this.money = this.money - electronics.getPrice();
		this.point = this.point + electronics.getPoint();

		System.out.println("현재 남은 돈 : " + this.money);
		System.out.println("현재 포인트 : " + this.point);

	}
}
