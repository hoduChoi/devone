package com.java.study2;

//실행 클래스.
public class AbstractVehicleMain {
	
	
	public static void main(String[] args) {
		//AbstractVehicle t2 = new AbstractVehicle(); 불가.
		AbstractVehicle t = new AbstractTaxi();
		AbstractVehicle b = new AbstractBus();
		
		t.board();
		t.move(30);
		t.pay(10);
		
		b.board();
		b.move(10);
		b.pay(20);
	}
}
