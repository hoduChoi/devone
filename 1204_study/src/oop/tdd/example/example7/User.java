package oop.tdd.example.example7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User implements Player{

	@Override
	public List<Integer> makeLotto() {
		// TODO 사용자는 로또 번호 입력받아서 생성.
		List<Integer> lottoList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 로또 번호 입력하세요.");
		
		int i = 0;
		int num = 0;
		try {
			while(lottoList.size() < 6) {
				System.out.println(i+1+"번째 번호 입력: ");
				num = sc.nextInt();
				
				if(num > 0 && num < 46) {//숫자가 1~45이면 
					if(!isExist(lottoList, num)) {
						lottoList.add(num);
						i++;
					}
				}
			}
		}catch(Exception e) {
			System.out.println("1~45 사이의 숫자만 입력하세요.");
			makeLotto();
		}
		return lottoList;
	}
	
	private boolean isExist(List<Integer> list, int num) {
		// TODO Auto-generated method stub
		boolean result = false;
		for(Integer i : list) {
			if(i == num) {
				result = true;
				break;
			}
		}
		return false;
	}
}
