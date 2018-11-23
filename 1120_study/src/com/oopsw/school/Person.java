package com.oopsw.school;

public class Person {
	private String name;
	private char gender;
	public Person() {}
	
	public Person(String name, char gender) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
}
