package ch07;

public class Hero {

	private String name;
	private int hp;
	private int power;

	public Hero(String name, int hp, int power) {
		this.name = name;
		this.hp = hp;
		this.power = power;
	}

	// getter , setter
	// read only
	public String getName() {
		return this.name;
	}

	public int getHp() {
		return this.hp;
	}

	public int gerPower() {
		return this.power;

	}

	// setter
	public void setpower(int power) {
		this.power = power;

	}

	//문제1.setName
	public void setName(String name) {
		this.name =name;
	}
	
	//문제2.setHp
	public void setHp(int hp) {
		this.hp = hp;
	}
}
