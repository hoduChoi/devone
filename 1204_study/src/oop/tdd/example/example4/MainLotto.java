package oop.tdd.example.example4;

import java.util.Scanner;

public class MainLotto {
	public static void main(String[] args) {
		//Lotto
		Lotto4 lotto = new Lotto4();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("돈을 입력해주세요.");
		
		int money = sc.nextInt();
		int gameCnt = money/1000;
		
		for(int i=0; i<gameCnt; i++) {
			System.out.println(lotto.generateLottos());
		}
	}
}
