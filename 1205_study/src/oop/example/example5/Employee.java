package oop.example.example5;

import java.util.Arrays;

public class Employee {
	private String name;
	private int[] hours; 
	
	public Employee(String name, int[] hours) {
		this.name = name;
		this.hours = hours;
	}
	
	int totalHours() {
		int sum=0;
		for(int i =0;i<hours.length;i++) {
			sum +=hours[i];
		}
		return sum;
	}

	@Override
	public String toString() {
		int totalSum = totalHours();
		return name+" "+totalSum;
	}
	
}
