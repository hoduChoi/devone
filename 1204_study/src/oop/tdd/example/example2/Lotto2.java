package oop.tdd.example.example2;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto2 {
	//collection shuffle -> Math.random
	public Lotto2(){
		
	}
	
	public String lottoNumber() {
		//Collection shuffle은 list형태로 45개를 섞어서
		//또 거기에 6개의 숫자를 배열에 새로 담음.
		int[] lottoNums = new int[6];
		
		//적긴하지만 매번 6번 돌림 
		for(int i=0; i<6; i++) {
			lottoNums[i] = (int)(Math.random()*45+1);
		}
		
		Arrays.sort(lottoNums);
		return Arrays.toString(lottoNums);
	}
	
	public static void main(String[] args) {
		Lotto2 lotto = new Lotto2();
		Scanner sc = new Scanner(System.in);
		System.out.println("돈을 입력해주세요");
		
		int money = sc.nextInt();
		int gameCnt = (money/1000);
		
		for(int i=0; i<gameCnt; i++) {
			System.out.println(lotto.lottoNumber());
		}
	}
}
