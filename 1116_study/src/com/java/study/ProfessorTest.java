package com.java.study;


public class ProfessorTest {
	//C언어나 php방식으로는 변수 선언 뒤 로직 구현. 
	//객체 설계
	//교수번호, 이름, 성별 , 과목이 필요함.
	
	public static void main(String[] args) {
	  	Professor p = new Professor();
	  	
	  	System.out.println(p.getProfessorNumber());
	  	System.out.println(p.getName());
	  	System.out.println(p.getGender());
	  	System.out.println(p.getSubject());
	  	
	  	//생성자 오버로딩.위에 생성자의 이름은 같지만 매개인자수가 다르게 정의됨. 
	  	//메서드와 구분하기 위해서 클래스의 이름과 같음.
	  	//여러 생성자를 정의해야할 때는 생성자 오버로딩 해야함. 
	  	//지정자(new) + 클래스명 (매개인자)
	  	Professor p2 = new Professor("123489","김효우", 'M',"컴퓨터");
	  	
	  	System.out.println(p2.getProfessorNumber());
	  	System.out.println(p2.getName());
	  	System.out.println(p2.getGender());
	  	System.out.println(p2.getSubject());
	  	
	  	p2.printAll();
	  	
	}
}
