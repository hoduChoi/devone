package oop.tdd.example.example5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LottoBall {
	private Set<Integer> lottoBall; //로또 볼 = 카드.
	private List<Integer> lottoBalls; //로또 볼 모음 = 카드덱.
	
	public LottoBall() {
		//
	}

	//lottoBall 클래스에서만 사용. 외부 노출 필요 없음.
	private List<Integer> randomBall() {//랜덤하게 담고 중복제거.
		// TODO Set클래스를 이용해 중복제거 후 Arraylist로 변환.
		lottoBall = new HashSet<Integer>(); //인덱스 기준이 아니라 해시코드 기준.
		while(lottoBall.size() < 6) {
			Double d = Math.random()*45+1;
			lottoBall.add(d.intValue());
		}
		
		lottoBalls = new ArrayList<Integer>(lottoBall);
		return lottoBalls;
	}

	public void playBall() {
		// TODO 로또 추첨.
		for(int i=0; i <randomBall().size(); i++) {
			System.out.println(i+1+"번 공은 "+randomBall().get(i)+" 입니다.");
		}
		
		System.out.println("이번주의 당첨 번호는 "+randomBall().toString()+"입니다. 축하드립니다~");
	}
}
