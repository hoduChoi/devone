package com.java.study;

//professor클래스 
public class Professor {
	//멤버변수 정의
	//생성자 정의
	//메서드 정의
	
	private String professorNumber;
	private String name;
	private char gender;
	private String subject;
	
	public Professor() {};
	public Professor(String professorNumber, String name, char gender, String subject) {
		super();
		this.professorNumber = professorNumber;
		this.name = name;
		this.gender = gender;
		this.subject = subject;
	}
	public String getProfessorNumber() {
		return professorNumber;
	}
	public void setProfessorNumber(String professorNumber) {
		this.professorNumber = professorNumber;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}	
	
	public void printAll() {
		System.out.println("교사번호: "+professorNumber +"이름: "+name+" 성별: "+gender+"담당과목: "+subject);
	}
}
