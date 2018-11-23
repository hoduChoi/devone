package com.oopsw.school;

public class Teacher extends Person{
	private String teacherNumber;
	private String pw; 
	
	public Teacher(String teacherNumber, String pw) {
		// TODO Auto-generated constructor stub
		this.teacherNumber = teacherNumber;
		this.pw = pw;
	}

	public Teacher(String teacherNumber, String name, char gender) {
		// TODO Auto-generated constructor stub
		super(name, gender);
		this.teacherNumber = teacherNumber;
	}

}
