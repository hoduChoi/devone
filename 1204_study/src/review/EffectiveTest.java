package review;
import java.util.Map;

public class EffectiveTest {
	private String name; 
	
	//constructor 
	//생성자 클래스명과 동일하기 때문에 객체에 대한 설명이 부족.
	public EffectiveTest(String name) {
		// 
		this.name = name;
	}
	//생성자는 오버로딩이 가능. but 똑같은 타입을 파라미터로 받은 생성자를 두개를 만들 수 없음. 
//	public EffectiveTest(String name2) {
//		
//	}
	
	//static factory method
	//getEffectiveName 이런식으로 설명 가능 
	public static EffectiveTest getEffectiveName(String name) {
		return null;
	}
	
	//리턴하는 객체 클래스가 다를 수 있음 
	//삼항연산통해서 리턴되는 객체 다르게 가능.
}

class Test {
	public static void main(String[] args) {
		//생성자 인스턴스 화 
		//new EffectiveTest 인스턴스 생성 EffectiveTest() 초기화 
		EffectiveTest effect = new EffectiveTest("jeong");
	}
}
