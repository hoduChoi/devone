package com.oopsw.school;
//공통 멤버 상속 받은 teacher클래스. 
//Person 에는 이름, 출력 메소드 존재 
public class Teacher extends Person{
	//멤버 변수 선언.
	private String teacherNumber;
	
	//생성자 선언.
	public Teacher(String name, String teacherNumber) {
		super(name); //부모의 생성자  
		this.teacherNumber = teacherNumber;
	}

	public String getTeacherNumber() {
		return teacherNumber;
	}

	@Override
	public String toString() {
		return "Teacher [teacherNumber=" + teacherNumber + super.toString()+"]";
	}
	
	//set은 왜 안하지.
}
