package 특강연습패키지연습;

public class Warrior {

	//name
	String name;
	//hp
	int hp;
	//생성자(둘다)
	public Warrior(String name) {
		super();
		this.name = name;
	}
	public Warrior(String name, int hp) {
		super();
		this.name = name;
		this.hp = hp;
	}
	
	//void attack()
	public void attack() {
		System.out.println("기본 공격");
	}
}
