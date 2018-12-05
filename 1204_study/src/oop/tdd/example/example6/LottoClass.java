package oop.tdd.example.example6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LottoClass {
	List<Integer> lottoList; //컴퓨터가 생성한 로또.
	List<Integer> userLottoList; //사용자가 입력한 로또.
	
	public void start() {
		while(true) {
			//로또 당첨번호 생성. makeLottoList();
			//오름차순 정렬. ascList();
			//결과 출력. printList();
			//유저 로또 입력. inputLotto();
			//당첨번호와 유저의 로또번호 비교. compareList();
			//최종 결과 출력.printResult();
			makeLottoList();
			ascList();
			printList(lottoList);
			inputLotto();
			int result = compareList(lottoList, userLottoList);
			printResult(result);
		}
	}
	
	private void makeLottoList() {
		// 로또 생성 (45개 중 6개 배열에 담음)
		lottoList = new ArrayList<Integer>();
		Random rnd = new Random(); //랜덤 클래스 생성.
		while(lottoList.size() < 6) {
			int num = rnd.nextInt(45)+1; //영역 개
			if(!isExist(lottoList, num)) { //false면 
				lottoList.add(num);
			}
		}
	}

	private void inputLotto() {
		// TODO Auto-generated method stub
		userLottoList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 로또 번호 입력하세요.");
		
		int i=0;
		int num=0;
		try {
			while(userLottoList.size() < 6) {
				System.out.println(i+1+"번째 번호 입력: ");
				num = sc.nextInt();
				
				if(num > 0 && num < 46) {//숫자가 1~45이면 
					if(!isExist(userLottoList, num)) {
						userLottoList.add(num);
						i++;
					}
				}
			}
		}catch(Exception e) {
			System.out.println("1~45 사이의 숫자만 입력하세요.");
			inputLotto(); 
		}
	}

	private void ascList() {
		// TODO Auto-generated method stub
		
	}
	private void printList(List<Integer> list) {
		// TODO Auto-generated method stub
		System.out.println("이번주 당첨번호는 ");
		System.out.println(list.toString());
	}
	private int compareList(List<Integer> lottoList, List<Integer> userLottoList) {
		// TODO Auto-generated method stub
		int result = 0;
		for(Integer i : lottoList) {
			for(Integer j: userLottoList) {
				if(i == j) {
					result++;
				}
			}
		}
		
		return result;
	}
	private void printResult(int result) {
		// TODO Auto-generated method stub
		System.out.println("축하합니다! 당신은 "+(7-result)+"등 입니다.");
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
	
	public static void main(String[] args) {
		new LottoClass().start();
	}
}
