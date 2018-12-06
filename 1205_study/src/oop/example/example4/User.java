package oop.example.example4;

public class User {
	
	private String name;
	private boolean isMale;
	private String gender;
	private double point; 
	
	public User(String name, boolean isMale) {
		this.name = name;
		this.isMale = isMale;
		this.point = (Math.random() * 5); 
	}

	@Override
	public String toString() {
		gender = (isMale() == true) ? "남": "여";
		return name+"("+gender+": "+Math.round(point*10)/10.0+")";
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public double getPoint() {
		return point;
	}

	public void setPoint(double point) {
		this.point = point;
	}
	
	
}
