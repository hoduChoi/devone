package com.oopsw.school;

//1. Login interface생성.
//2. interface 연결된 TeacheLogin class생성.
public class TeacherLogin implements Login{

	@Override
	public Person login(String teacherNumber, String pw) {
		// TODO Auto-generated method stub
		return login(new Teacher(teacherNumber, pw));
	}

	@Override
	public Person login(Person p) {
		// TODO Auto-generated method stub
		if(p != null && p instanceof Teacher) {
			return new Teacher("교사번호", "이름", 'F');
		}
		return null;
	}

}
