package ch02;

public class Warrior extends Hero{

	public Warrior(String name,int hp) {
		super(name,hp);
	}
	
	
	public void comboAttack() {
		System.out.println("2단 공격 합니다.");
	}

}
