package oop.example.example1;

import java.util.Random;

public class Heros {
	private String name;
	private int hp = 100;
	
	public Heros(String name) {
		this.name = name;
	}
	
	public void punch(Heros enermy) {
		enermy.hp -=10;
		System.out.printf("[%s]의 펀치\n", this.name);
		System.out.printf("[%s]의 hp\n", this.hp);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Heros [name=" + name + ", hp=" + hp + "]";
	}
	
	public static void main(String[] args) throws InterruptedException {
		//두 영웅 객체 생성
		Heros arthas = new Heros("arthas");
		Heros leona = new Heros("leona");
		//공격, 방어 객체 생성
		Heros attacker = null;
		Heros defender = null;
		
		Random rnd = new Random();
		//두 영웅이 남아있다면 계속 싸움 
		while(arthas.hp > 0 && leona.hp > 0) {
			//1/2 확률로 공격자 선정 - random 
			boolean flag = rnd.nextBoolean();
			if(flag == true) {
				attacker = arthas;
				defender = leona;
			}else {
				attacker = leona;
				defender = arthas;
			}
			//대상을 공격
			attacker.punch(defender);
			//딜레이 1
			Thread.sleep(1000);
		}
	}
}
