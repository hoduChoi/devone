package com.test.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;
import com.oopsw.school.Teacher;

public class OOPTest_02 {
	public static void main(String[] args) {
		Person p1 = new Student("s001","홍길동");
		Person p2 = new Teacher("이순신", "t001");
		
		p2 = new Teacher("홍길동", "t002");
		p1.printAll();
		p2.printAll();
		
		System.out.println("end");
	}
}
