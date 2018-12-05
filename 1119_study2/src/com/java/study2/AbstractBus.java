package com.java.study2;

public class AbstractBus extends AbstractVehicle{

	@Override
	public void move(int road) {
		// TODO Auto-generated method stub
		System.out.println("버스 목적지.");
	}

	@Override
	public void pay(int money) {
		// TODO Auto-generated method stub
		System.out.println("버스 요금 지불.");
	}

}
