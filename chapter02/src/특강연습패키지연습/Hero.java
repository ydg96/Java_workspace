package 특강연습패키지연습;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private int level;
	
	//getter , setter 메서드를 만들어 주세요.
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name == null || name == "" ||name.length() < 2){
			System.out.println("잘못된 입력 입니다.이름을 다시 말하시오.");
		}
	}
}
