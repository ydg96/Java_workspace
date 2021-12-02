package 특강연습;

public class Archer extends Hero{

	public Archer(String name,int hp) {
		super(name,hp);
	}
	public void fireArrow() {
		System.out.println("궁수 불화살 공격");
	}
}
