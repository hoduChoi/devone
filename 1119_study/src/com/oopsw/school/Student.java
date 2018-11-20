package com.oopsw.school;
//학생 - 학번, 이름, 출력()
public class Student extends Person{ //0.
	private String studentNumber; //1.
	
	//3. 생성자선언.
	public Student(String studentNumber, String name) {
		super(name); //부모 생성자, 
		//new를 안 쓰고 생성자를 호출하게끔 유도. 생성자에서 다른 생성자 호출할 때는 1번
		//자식이 부모 생성자 호출 가능.
		//부모는 자식 생성자 호출 불가능.
		this.studentNumber = studentNumber;
	}
	//2.
	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	//5.상속 후 부모의 멤버 메소드 중에서 구현부를 수정 -Overriding
	@Override
	public void printAll() {
		//override 하지 않으면 학번만 출력됨.
		System.out.println("학번: "+studentNumber);
		super.printAll(); //부모의 메소드 호출.
	}
	
	@Override
	public String toString() {
		return "Student [studentNumber=" + studentNumber + super.toString() +"]";
	}//부모의 toString호출 
	
	//overriding: 상속이 전제. 부모의 멤버 중 일부 구현부 변경(printAll).
	//단, 부모의 인터페이스는 동일하게
	//overloading: 하나의 클래스 혹은 상속받은 클래스의 멤버의 정의.
	//같은 이름의 생성자나 메소드를 사용하되 매개인자 수나 자료형을 다르게  
}
