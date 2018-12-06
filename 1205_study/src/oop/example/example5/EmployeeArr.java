package oop.example.example5;

public class EmployeeArr {
	String name;
	int sum;
	
	public EmployeeArr(String name, int sum) {
		this.name = name;
		this.sum = sum;
	}

	@Override
	public String toString() {
		return String.format("%s\t%d", name, sum);
	}
}
