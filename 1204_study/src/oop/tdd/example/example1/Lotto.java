package oop.tdd.example.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lotto {
	//몇만원어치 살껀지 입력 후 
	//1줄당 1000원에 해당 줄만큼 추출해줌 
	public Lotto(){
		//
	}
	public String lottoNumber() {
		//45개 공 담음 
		List<Integer> lottos = new ArrayList<Integer>();
		
		for(int i = 1; i <= 45; i++) {
			lottos.add(i);
		}
		
		//담은 것 Collections.shuffle이용
		Collections.shuffle(lottos);
		
		//무작위 섞은 것 중에 6개 추출 
		int[] lottoNums = new int[6];
		for(int i = 0; i < 6; i++) {
			lottoNums[i] = lottos.get(i);
		}
		
		//정렬
		Arrays.sort(lottoNums);
		
		return Arrays.toString(lottoNums);
	}
	
	public static void main(String[] args) {
		//scanner 
		//추출결과 
		Lotto lotto = new Lotto();
		Scanner sc = new Scanner(System.in);
		System.out.println("돈을 입력하세요");
		
		int money = sc.nextInt();
		int gameCnt = (money/1000);
		
		for(int i = 1; i <= gameCnt; i++) {
			System.out.println(i+" 번째 로또 추출 번호: " + lotto.lottoNumber());
		}
	}
}
