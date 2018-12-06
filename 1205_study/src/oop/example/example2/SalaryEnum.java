package oop.example.example2;

/*
 * f(career < 3) {
			level = "beginning";
		}else if(career < 7) {
			level = "intermediate";
		}else if(career >= 7){
			level = "high";
		}
 */
public enum SalaryEnum {
	BEGIN(2800), INTERMEDIATE(3500), HIGH(4500),UNKNOWN(0);
	
	private int value;
	
	private SalaryEnum(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}
		
	//if
	public static int valueOf(int value) {
		if(value < 3) {
			return SalaryEnum.BEGIN.getValue();
		}else if(value < 7) {
			return SalaryEnum.INTERMEDIATE.getValue();
		}else if(value >= 7) {
			return SalaryEnum.HIGH.getValue();
		}else {
			return SalaryEnum.UNKNOWN.getValue();
		}
	}
	
}
