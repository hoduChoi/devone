package com.oopsw.school;

public class Student extends Person {
	private String studentNumber;
	private String pw; 
	
	public Student() {}
	public Student(String studentNumber, String pw) {
		// TODO Auto-generated constructor stub
		this.studentNumber = studentNumber;
		this.pw = pw;
	}

	public Student(String studentNumber, String name, char gender) {
		// TODO Auto-generated constructor stub
		super(name, gender);
		this.studentNumber = studentNumber;
	}

	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + super.toString() + "]";
	}

}
//생성자가 먼저 생성이 된다. 그리고 변수를 생성해준다.