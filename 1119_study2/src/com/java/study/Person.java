package com.java.study;

import java.io.Serializable;

//공통 멤버클래스 이름, 성별, toString 
public class Person implements Serializable{
	
	private String name;
	private char gender;
	
	//생성자를 왜 또 하지..
	public Person() {}
	
	public Person(String name, char gender) {
		this.name = name;
		this.gender = gender;
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

	@Override
	public String toString() {
		return String.format("Person{name='%s', gender='%c'}", name, gender);
	};
	
	
}
