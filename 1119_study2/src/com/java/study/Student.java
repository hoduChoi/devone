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

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = super.hashCode();
//		result = prime * result + ((studentNumber == null) ? 0 : studentNumber.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!super.equals(obj))
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (studentNumber == null) {
//			if (other.studentNumber != null)
//				return false;
//		} else if (!studentNumber.equals(other.studentNumber))
//			return false;
//		return true;
//	}
	
	
}
