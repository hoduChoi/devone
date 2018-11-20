package com.test.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;

//main클래스. 
public class OOPTest_01 {
	//다형성.
	//이름이 같은 메서드(printAll) 다양한 형태의 처리부 제공. 
	//부모객체의 메서드 재정의. 부모객체 : Person printAll
	//재정의한 부모 객체로 선언하고 자식 객체로 생성.
	//선언한 부모객체는 다양한 구현부를 가진 동작을 호출함.
	//단, 부모가 선언하지 않은 메소드를 호츨하면 컴파일 오류 발생.
	//자식이 뭐가 있던 상관없이 부모에서는 동일한 메서드를 호출할 수 있음.
	public static void main(String[] args) {
		Student s1 = new Student("t001", "홍길동");
		s1.printAll(); //부모인 Person에서 가져옴. 이름만 출력됨.
		Person p = new Person("이순신"); //재정의한 부모 객체로 선언하고 
		p.printAll();
		p = new Student("t002", "전혜영"); //자식 객체로 생성
		p.printAll();
		
	}
}

