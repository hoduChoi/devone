package com.java.study;

//학사 관리 프로그램에 필요한 키
//student라는 클래스에 학번, 이름, 성별 data 
// ex)축구팀이라는 클래스에 감독(생성자), 코치(메소드), 팀멤버 (변수)
//TDD(Test-Driven Development)
//: 소프트웨어를 구현하는 과정에서 문제점을 제대로 찾으려면 테스트가 명확.
//내가 원하는 테스트 코드를 먼저 만들고 필요한 구현부를 처리하는 방식 
/**
 * @author jechoi
 *
 */
public class StudentTest {
	//학번, 이름, 성별
	public static void main(String[] args) {
		//학생 한명.string은 쌍따옴표, char은 홑따옴
//		String studentNumber = "20092330";
//		String name = "홍길동";
//		char gender = 'M';
//		
//		System.out.println(studentNumber);
//		System.out.println(name);
//		System.out.println(gender);

		//학생 1명 추가 (잘못된 방법) - 전형적인 c언어 형태.
//		String[] studentNumber = {"20092330", "20092331"};
//		String[] name = {"홍길동","홍길순"};
//		char[] gender = {'M', 'F'};
//		for(int i = 0; i < studentNumber.length; i++) {
//			System.out.println(studentNumber[i]);
//			System.out.println(name[i]);
//			System.out.println(gender[i]);
//		}
		//구조체 형태(구조체의 장점은 틀은 제공해주지만 그 안에서 유효한 범위인지 체크하지 못함)
		
//		Student s = new Student();
//		
//		System.out.println(s.studentNumber);
//		System.out.println(s.name);
//		System.out.println(s.gender);
//		Student s = new Student();
//		System.out.println(s.name);
		
		Student s = new Student();
		//VM은 타입을 알 수 없음. VM이 이해할 수 있도록 class 이름 = 생성자 이름()
		System.out.println(s.getGender());
		s.setGender('F');
		System.out.println(s.getGender());
		System.out.println(s.getStudentNumber());
		System.out.println(s.getName());
		
		Student s2 = new Student("200101001", "여자", 'F');
		System.out.println(s2.getStudentNumber());
		System.out.println(s2.getName());
		System.out.println(s2.getGender());
		
		s2.printAll();
	}
}