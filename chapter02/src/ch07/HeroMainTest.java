package ch07;

public class HeroMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hero hero = new Hero("질럿", 100, 10);

		String name = hero.getName();
		System.out.println(name);

		int hp = hero.getHp();
		System.out.println(hp);

		int power = hero.gerPower();
		System.out.println(power);
	
		//공격력 업그레이드
		hero.setpower(20);
		int power2 = hero.gerPower();
		System.out.println(power2);
		
		//방어력 업그레이드
		hero.setHp(200);
		System.out.println(hero.getHp());
		
		
		
	
	}

}
