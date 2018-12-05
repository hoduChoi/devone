package oop.tdd.example.example7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer implements Player{

	@Override
	public List<Integer> makeLotto() {
		// TODO 컴퓨터는 랜덤으로 로또 생성.
		//로또 객체 타입.
//		List<Lotto7> lottoList = new ArrayList<Lotto7>();
//		//add에는 Object 타입이 들어가야함. 왜냐 데이터 타입 자체가 클래스 타입이므로 
//		//객체를 인스턴스화 한 해당 객체가 파라미터로 들어가야함.
//		
//		while(lottoList.size() < 6) {
//			Random rnd = new Random();
//			int num = rnd.nextInt(45)+1;
//			Lotto7 lottos = new Lotto7(num);
//
//			System.out.println(lottos);
//			//유효성 검사 
//			lottos.isExist(lottoList, num)
//			lottoList.add(lottos);
//		}
		//이렇게 불가능 -> 근데 내가 로또 리스트를 생성하는 것 자체를 로또에게 권한 부여 
		//while돌면서 random함수 하는 거라 로또 따로 빼면 비효율. 즉, 공통 기능이 아님.
		List<Integer> lottoList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		while(lottoList.size() < 6) {
			int num = rnd.nextInt(45)+1;
			if(!isExist(lottoList, num)) {
				lottoList.add(num);
			}
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
