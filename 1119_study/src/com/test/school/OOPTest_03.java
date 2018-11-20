package com.test.school;

import com.oopsw.school.Person;
import com.oopsw.school.Student;

//최 상위 객체(Object)에 대한 오버라이딩의 필요성.
public class OOPTest_03 {
	public static void main(String[] args) {
		int num = 10;
		String s1 = "hi";
		String s2 = new String("hi");
		Person s3 = new Person("홍길동");
		Student stu1 = new Student("s001", "홍길동");
		System.out.println(num);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(stu1);
	}
}
