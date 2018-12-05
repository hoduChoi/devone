package oop.tdd.example.example3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Lotto3 {
	public Lotto3() {
		
	}
	
	public String lottoNumbers() {
		Set<Integer> lottoNums = new HashSet<Integer>();
		
		//Set은 중복제거해줌
		while(lottoNums.size() < 6) {
			Double d = Math.random()*45+1;
			lottoNums.add(d.intValue());
		}
		
		//Set -> List 
		List<Integer> list = new ArrayList<Integer>(lottoNums);
		
		Collections.sort(list);
		return list.toString();
		
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Lotto3 lotto = new Lotto3();
		Scanner sc = new Scanner(System.in);
		System.out.println("돈을 입력해주세요.");
		int money = sc.nextInt();
		int gameCnt = money/1000;
		
		for(int i=0; i<gameCnt; i++) {
			System.out.println(lotto.lottoNumbers());
		}
	}
}
