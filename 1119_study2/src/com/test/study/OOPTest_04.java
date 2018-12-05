package com.test.study;

import com.java.study.Person;
import com.java.study.Student;
import com.java.study.Teacher;

public class OOPTest_04 {
	public static void main(String[] args) {
		int num1 = 10;
		String s1 = "hi";
		String s2 = new String("hi");
		Person p1 = new Person("홍길동", 'M');
		Student stu1 = new Student("홍길동", 'M', "s001");
		Teacher t1 = new Teacher("홍길순", 'M', "t001", "컴퓨터");
		
		int num2 = 10; 
		String s3 = "hi";
		String s4 = new String("hi");
		Person p2 = new Person("홍길동",'M');
		Student stu2 = new Student("홍길동", 'M', "s002");
		Person p3 = p2; //내 주소를 공유
		Teacher t2 = new Teacher("홍길순", 'M', "t001", "컴퓨터");
		
		System.out.println(num1 == num2); //true
 		System.out.println(s1 == s2); //false (s1은 String, s2는 객체)
 		// == : 값이던지 주소던지 현재를 비교. 비교 연산자.
		System.out.println(s1 == s3); //true 둘다 stack에 있기 때문에 
		System.out.println(s2 == s4); //false 
		System.out.println(s2.equals(s4)); //true new 객체. equals: 메서드.객체끼리 비교. 대상의 내용 자체를 비교.
		System.out.println(p1 == p2); //false 각자  new를 줬기 때문에 따로 가지고 있음.
		System.out.println(p2 == p3); //true 주소를 비교.
		// equals : 값을 비교.
 		System.out.println(p1.equals(p2)); //false -> true (Person에 equals()를 추가)
 		//equals가 Object이므로 부모의 멤버로 올라가지만, 내려올 수 없어서 내용 비교 안됨.
 		//객체를 비교하려면, 무조건 equals로 하는 것이 아니라 필히 재정의를 하는(Student, Teacher) 클래스만 equals를 쓸 수 있다.
		System.out.println(p2.equals(stu2)); //false
		System.out.println(stu1.equals(stu2)); //true -> false(Student에 equals() 추가)
		System.out.println(t1.equals(t2)); //true -> false(Student에 equals() 추가)
	}
}
