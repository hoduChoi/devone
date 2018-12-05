package oop.tdd.example.example5;

import java.util.Scanner;

public class MainLotto5 {
	public static void main(String[] args) {
		//Lotto5 lotto = new 
		Lotto lotto = new Lotto();
		System.out.println("시작하려면 아무 키나 눌러주세요.");
		Scanner sc = new Scanner(System.in);
		String key = sc.nextLine();
		
		lotto.play();
		//System.out.println();
	}
}
