package com.oopsw.school;


public class StudentLogin implements Login{

	@Override
	public Person login(String studentNumber, String pw) {
		// TODO Auto-generated method stub
		return login(new Student(studentNumber, pw));
	}

	@Override
	public Person login(Person p) {
		// TODO Auto-generated method stub
		if(p != null && p instanceof Student) {
			return new Student("로그인아이디", "이름", 'F');
		}
		return null;
	}


}
