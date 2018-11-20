package com.java.study;

//교사 클래스 - 교사번호, 담당 과목, person 상속 
public class Teacher extends Person{
	private String teacherNumber;
	private String subject;
	
	public Teacher(String name, char gender, String teacherNumber, String subject) {
		super(name, gender);
		this.teacherNumber = teacherNumber;
		this.subject = subject;
	}

	public String getTeacherNumber() {
		return teacherNumber;
	}

	public void setTeacherNumber(String teacherNumber) {
		this.teacherNumber = teacherNumber;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return super.toString()+" 교사번호: " + teacherNumber + ", 과목명: " + subject;
	}
}
