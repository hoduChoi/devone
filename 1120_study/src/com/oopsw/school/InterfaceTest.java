package com.oopsw.school;

public class InterfaceTest {
	public static void main(String[] args) {
		//1. 학생 로그인 테스트
		StudentLogin s1 = new StudentLogin();
		System.out.println(s1.login("2001", "1234"));
		System.out.println(s1.login(null));
	}
}
