package oop.tdd.example.example5;

public class LottoSpeaker {
	
	//발표자, 공
	private String lottoSpeaker;
	//private int ball;
	
	public LottoSpeaker(String lottoSpeaker) {
		this.lottoSpeaker = lottoSpeaker;
	}
	
	public void getSpeakerName() {
		System.out.println("금주의 로또 걸은 "+lottoSpeaker+" 입니다.");
	}
}
