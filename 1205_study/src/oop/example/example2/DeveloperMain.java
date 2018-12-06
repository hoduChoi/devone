package oop.example.example2;

import java.util.Scanner;

public class DeveloperMain {
	public static void main(String[] args) {
		//객체 인스턴스화.
		System.out.println("경력을 입력해주세요: ");
		Scanner sc = new Scanner(System.in);
		
		args = new String[3];
		
		for(int i = 0; i < args.length; i++) {
			args[i] = sc.next();
		}
		
		Developer tom = new Developer("Tom", Integer.parseInt(args[0]));
		Developer john = new Developer("John", Integer.parseInt(args[1]));
		Developer sally = new Developer("Sally", Integer.parseInt(args[2]));
		
		System.out.println(tom.salary());
		System.out.println(john.salary());
		System.out.println(sally.salary());
	}
}
