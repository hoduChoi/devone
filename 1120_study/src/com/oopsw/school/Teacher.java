package com.oopsw.school;

public class Teacher extends Person{
	private String teacherNumber;
	private String pw; 
	
	public Teacher() {}
	//생성자 오버로딩.
	public Teacher(String teacherNumber, String pw) {
		// TODO Auto-generated constructor stub
		this.teacherNumber = teacherNumber;
		this.pw = pw;
	}
	//생성자 오버로딩.
	public Teacher(String teacherNumber, String name, char gender) {
		// TODO Auto-generated constructor stub
		super(name, gender);
		this.teacherNumber = teacherNumber;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + teacherNumber + ", pw=" + super.toString() + "]";
	}

}
