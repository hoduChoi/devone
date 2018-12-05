package com.java.study2;
//운송수단 (부모 클래스)
//자식 클래스 - 택시, 버스 
//이동, 교통비 지불이 택시와 버스의 특성에 따라 달라짐
//따라서 부모클래스인 운송수단 내에 이동하다, 교통비 지불하다라는 메서드를 추상 메서드로 선언.
//자식 클래스에서 재 구현하도록 설계.
abstract class AbstractVehicle {
	public AbstractVehicle() {} // 생성
	
	//일반 메서드: 타다. 추상 메서드: 이동하다, 지불하다.
	//공통 기능으로 정의.
	public void board() {
		System.out.println("탑승.");
	}
	
	//구현부 없이 추상 메서드 선언. 이동 방법과 지불을 자식 클래스에 구현을 위임.
	public abstract void move(int road); 
	public abstract void pay(int money);
}
