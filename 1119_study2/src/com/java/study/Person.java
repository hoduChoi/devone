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
	}

	//주소 자체를 비교하는 메서드. Collection API 알아야 함.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + gender;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	//주로 자주 사용. 비교 메서드. 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	};
	
	
}
