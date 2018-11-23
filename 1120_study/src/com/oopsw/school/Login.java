package com.oopsw.school;

/* 경험 or 유연한 사고가 중요.  ==> TDD. */
public interface Login {
	/*학사관리 프로그램에서 로그인 후에 그 사람의 정보를 출력.*/
	Person login(String id, String pw);
	Person login(Person p);
}
