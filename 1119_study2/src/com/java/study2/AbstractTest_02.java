package com.java.study2;
//2. 추상메서드가 없는 추상 클래스 - 상속만 유도. ex) UI의 이벤트 처리.
//
abstract class SuperB {
	//추상메서드를 포함하지 않아도 abstract class로 선언하면 추상클래스로 인지.
	//생성자 
	public SuperB(String name) {}
	
}

class SubB extends SuperB {
	//생성자. 위에 추상 클래스에서 선언된 메서드가 없으니 재 구현할 메서드도 없음.
	public SubB() {
		super("no name");
	}
}

//실행 클래스.
public class AbstractTest_02 {
	public static void main(String[] args) {
		SuperB b;
		b = new SubB();
	}
}
