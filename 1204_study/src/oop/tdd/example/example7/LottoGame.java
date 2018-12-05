package oop.tdd.example.example7;

import java.util.List;

public class LottoGame {
	
	public void play() {
		List<Integer> computerList; 
		List<Integer> userList; 
		//컴퓨터
		Computer computer = new Computer();
		computerList = computer.makeLotto();
		
		//User
		User user = new User();
		userList = user.makeLotto();

		//출력 
		this.printList(computerList);
		//비교 
		int result = this.compareList(computerList, userList);
		//결과
		this.printResult(result);
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
}
