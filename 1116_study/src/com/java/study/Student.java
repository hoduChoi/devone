package com.java.study;

//student클래스.
public class Student {
//구조체 형태. 이것도 안 좋음.
//문제점: 구조체에서 데이터 보호 못함, 외부 객체가 내부 아래 데이터에 직접 접근하지 못하고 
//operation을 통해서만 간접접근이 가능.
//보안문제
//set(), get() 안됨.
//	String studentNumber = "20092330";
//	String name = "홍길동";
//	char gender ='M';
	
//	String studentNumber = "20092330";
//	String name = "홍길동";
//	char gender ='M';
	//즉, c언어처럼 짜서도 안되고, 구조체처럼 짜서도 안됨. 
	//getter, setter통해서 private한 멤버 데이터는 보안되고 
	//데이터에 접근가능한 메소드를 생성하여 해당 메소드로 접근되도록.
	//1. - member data
	// - : private 
	private String studentNumber; //묵시적 초기화 
	private String name; //묵시적 초기화 
	private char gender = 'M';  //명시적 초기
	
	//3. 생성자(멤버데이터와 세컨메서드 사이에 작성) 
	//생성자는 클래스 이름을 따른다. 
	//매개인자가 있으면 초기화 하는 값이 있음. => overloading(초기화 경우의 수)
	//VM은 생성자가 없을 때만 아무일 하지 않는 생성자 제공.
	public Student() {} //매개인수도 없고 하는 일도 없는 것.
	public Student(String studentNumber, String name, char gender) {
		super();
		this.studentNumber = studentNumber;
		this.name = name;
		this.gender = gender;
	}	
	//세컨메서드 
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}	
	
	//조회 메소드 추가 
	public void printAll() {
		System.out.println("학번: "+studentNumber+" 이름: "+name+" 성별: "+gender);
		
	}
}
