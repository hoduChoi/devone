package com.java.study2;

//추상 클래스 상속.
public class AbstractTaxi extends AbstractVehicle{

	//추상 메서드 재 구현.
	@Override
	public void move(int road) {
		// TODO Auto-generated method stub
		if(road > 20) {
			System.out.println("택시 탑승 가능.");
		}else {
			System.out.println("택시 탑승 불가.");
		}
		
	}

	@Override
	public void pay(int money) {
		// TODO Auto-generated method stub
		if(money > 10) {
			System.out.println("택시 탑승 가능.");
		}else {
			System.out.println("택시 탑승 불가.");
		}
	}

}
