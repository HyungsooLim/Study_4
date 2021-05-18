package com.hs.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		Tv tv = new Tv();
		Phone phone = new Phone();
		computer.info();
		
		//다형성
		Electronics electronics = computer;
		System.out.println(electronics.getCompany());
		System.out.println(electronics.getBrand());
		System.out.println(electronics.getPrice());
		System.out.println(electronics.getPoint());
		
		
		computer = (Computer)electronics;		//<- 강제 형변환
		System.out.println(computer.getCompany());
		System.out.println(computer.getBrand());
		System.out.println(computer.getPrice());
		System.out.println(computer.getPoint());
		System.out.println(computer.getCpu());  // <- 이건 가능
		
//		Electronics ele = new Electronics();
//		computer = (Computer)ele;
//		System.out.println(computer.getCompany());
//		System.out.println(computer.getBrand());
//		System.out.println(computer.getPrice());
//		System.out.println(computer.getPoint());
//		System.out.println(computer.getCpu()); 
		
		System.out.println("------------------------------------");
		//배열, 장바구니
		Electronics[] ar = new Electronics[3];
		ar[0]=computer;
		ar[1]=tv;
		ar[2]=phone;
		Customer customer = new Customer();
		customer.setMoney(2000);
		customer.setPoint(0);
		customer.buy(computer);
		
		
	}
}
