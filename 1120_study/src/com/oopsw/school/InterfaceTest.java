package com.oopsw.school;

public class InterfaceTest {
	public static void main(String[] args) {
		//1. 학생 로그인 테스트
		StudentLogin s1 = new StudentLogin();
		//오버로딩된 생성자 이용하기.
		System.out.println(s1.login("2001", "1234"));
		System.out.println(s1.login(null));
		//2. 학생 또는 교사 또는 직원 등 이 로그인 하는 것. => 다형성을 활용하여 유연성을 확보하는 설계.
		Login all;
		all = new StudentLogin();
		System.out.println(all.login("s000", "000"));
		all = new TeacherLogin();
		System.out.println(all.login("t000", "001"));
	}
}
