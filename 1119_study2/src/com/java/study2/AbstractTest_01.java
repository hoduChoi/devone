package com.java.study2;

//					생성자		자식클래스		다중상속		내용	
//Interface			없다.			필수			O			메서드 중심의 비즈니스 설계. 데이터는 모두 public final static
//abstract class 	new 불가		필수 			X			정의된 메서드 중 공통 구현부 정의. this(), super()로만 생성자 사용.
//class				사용가능		선택			X			완벽한 객체.

//1. 추상클래스: 멤버 메서드 중에 일부를 재정의를 필수로 하고 싶다. 
//클래스들 중에서 꼭 내가 재정의해야할 부분의 구현부를 빼버리는 것.
//Person 클래스와 다르게 해당 부모 클래스에 있는 기능 메서드를 특성에 맞게 재 구현을 원할 경우.
//추상 메서드로 선어하고 자식 클래스에서 재 구현하도록 설계.
abstract class SuperA { //public을 붙일 수 없음.
	// 3) 추상 메서드가 1개라도 있으면 무조건 추상 클래스 (abstract)

	public SuperA() { //생성자 
		System.out.println("SuperA()");
	}
	
	//추상 메서드.
	public abstract void methodA();// 1) 구현부가 없음.
	// 2) 구현부가 없으면 메서드는 지정자를 추가. (abstract)
	public void methodB() {}

}

class SubA1 extends SuperA {
	// 4) 상속받은 추상 메서드는 무조건 재정의. 구체화. 프로그램의 표준화 정도를 높임.
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("SubA1's methodA()");
		
	}
	
}

public class AbstractTest_01 {
	public static void main(String[] args) {
		SuperA a1;
		//a1 = new SuperA(); //문법으로 못씀. 
		a1 = new SubA1(); // 5) 자식을 통해서만 생성 가능 - 다형성 필요. 
		//자식이 생성될 때 부모가 먼저 호출. 구현되지 않는 기능을 포함한 클래스기 때문에 자식 클래스를 인스턴스화.
		a1.methodA();
	}
}
//컴파일 오류는 무조건 위에서 부터.