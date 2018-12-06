package oop.example.example3;

import java.util.Scanner;

public class CircleTest {
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		
		circle1.setRadius(2);
		
		Circle circle2 = new Circle((int) (1 + Math.random()*4));
		
		System.out.println(circle1.toString());
		System.out.println(circle2.toString());
		
		System.out.println(circle1.getCircleArea());
		System.out.println(circle2.getCircleArea());
	}
}
