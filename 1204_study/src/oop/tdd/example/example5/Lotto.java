package oop.tdd.example.example5;

public class Lotto {

	
	public void play() {
		// TODO Auto-generated method stub
		LottoSpeaker speaker = new LottoSpeaker("최정은");
	    speaker.getSpeakerName();
		
		LottoBall lottoBall = new LottoBall();
		lottoBall.playBall();
	}

}
