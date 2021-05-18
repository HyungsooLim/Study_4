package com.hs.s5;

public class StaticTest {
	//상수형태의 변수명은 전부 대문자
	public static final int NUM=30;
	
	//StaticTest.num
	//       {} //instance block -> 생성자 초기화
	
	static {
		//StaticTest.num=30;
	}						//<- static 생성자 블럭 static에 구체적인 초기화
	
}
