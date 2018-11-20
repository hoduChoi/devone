package com.oopsw.school;
//공통 멤버를 갖는 클래스 
//학생과 교사의 공통 이름, 출력()
public class Person {	
	//멤버 변수 정의
	//생성자 정의
	//메소드 정의
	private String name;
	
	public Person(){}
	
	//생성자 오버로딩 
	//this(): 나의 생성자 super(): 부모의 생성자
	//자식은 부모를 가리킬 수 있지만 부모는 자식을 가리킬 수 없음.
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printAll() {
		System.out.println("이름: "+name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	//객체지향 언어들은 객체에 toString이라는 메소드를 기본적으로 제공.
	//일반적으로 toString은 객체를 설명해주는 문자열을 리턴.
	//toString을 오버라이딩 하면 다른 형식의 문자열을 리턴할 수 있음.
	//public String toString : 인터페이스
	//String  :  선언타입
	//toString : 식벽자
	//() : 매개인자
	//부모의 인터페이스는 수정 불가.
	
}
