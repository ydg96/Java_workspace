package 특강연습;

public class Wizard extends Hero{


	public Wizard(String name,int hp) {
		super(name,hp);
	}
	public void freezing() {
		System.out.println("마법사 얼리기 공격");
	}
}
