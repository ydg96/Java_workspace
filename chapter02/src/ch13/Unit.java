package ch13;

public abstract class Unit {

	protected String name;
	protected int power;
	protected int hp;

	public String getName() {
		return name;
	}

	public int getPower() {
		return power;
	}

	public int getHp() {
		return hp;
	}

//	public abstract  void showInfo();
	public void showInfo() {
		System.out.println("====정보창(" + this.name + " ) ====");
		System.out.println("이름 : " + this.name);
		System.out.println("공격력 : " + this.power);
		System.out.println("체력 : " + this.hp);
		System.out.println("============");
	}

	public void attack(Unit unit) {
		System.out.println(this.name + " 이 " + unit.getName() + " 을 공격 합니다.");
		unit.beAttacked(this.power);
	}

	public void beAttacked(int power) {
		if (this.hp == 0) {
			System.out.println("이미 사망하였습니다.");
		} else {
			this.hp -= power;
		}
	}



}
