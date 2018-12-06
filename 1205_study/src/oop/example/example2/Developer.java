package oop.example.example2;

//https://cloudstudying.kr/lectures/200
public class Developer {
	//필드 구현.
	private String name;
	private int career;
	//private String level;
	
	//생성자 구현.
	public Developer(String name, int career) {
		this.name = name;
		this.career = career;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCarrer() {
		return career;
	}

	public void setCarrer(int career) {
		this.career = career;
	}
	
	//메소드 구현.
	//enum으로 빼볼까 
//	public String level(int career) {
//		String level = null; 
//		
//		if(career < 3) {
//			level = "beginning";
//		}else if(career < 7) {
//			level = "intermediate";
//		}else if(career >= 7){
//			level = "high";
//		}
//		
//		return level;
//	}
	
	public int salary() {
//		String lv = this.level(career);
//		int money = 0;
//		
//		if(career < 3) {
//			
//		}else if(career < 7) {
//			level = "intermediate";
//		}else if(career >= 7){
//			level = "high";
//		}
		//SalaryEnum.valueOf(career);
		
		return SalaryEnum.valueOf(career) + (100 * career);
		
	}
	
}
