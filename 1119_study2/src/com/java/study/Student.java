package com.java.study;

//학생 클래스 Person클래스를 상속. - 학번 
public class Student extends Person{
	private String studentNumber;
	
	//생성자 
	public Student(String name, char gender, String studentNumber) {
		super(name, gender);
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	@Override
	public String toString() {
		return super.toString()+" 학번: " + studentNumber;
	}//toString
	
}
