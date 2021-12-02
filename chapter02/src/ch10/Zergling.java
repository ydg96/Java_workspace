package ch10;

public class Zergling {
	private String name;
	private int power;
	private int hp;
	
	public Zergling(String name) {
		this.name =name;
		this.power =5;
		this.hp = 100;
	}

	public String getName() {
		return this.name;
	}

	public int getPower() {
		return this.power;
	}
	public int gerHp() {
		return this.hp;
	}

	public void showInfo() {
		System.out.println("===����â==="+(this.name));
		System.out.println("�̸�" + this.name);
		System.out.println("���ݷ� " + this.power);
		System.out.println("ü�� " + this.hp);
		System.out.println("=======================");
	}
	//���۸��� ������ ���� �մϴ�.
	public void attackZealot(Zealot zealot) {
		System.out.println(this.name + "�� ������ �����մϴ�.");
		zealot.beAttackZealot(this.power);
	}
	//���۸��� ������ ���� �մϴ�.
	public void attackMarine(Marine marine) {
		System.out.println(this.name + "�� ������ �����մϴ�.");
		marine.beAttackMarine(this.power);
	}
	public void attack(Zealot Zealot) {
		System.out.println(this.name + "��" + Zealot.getName() + "�� ���� �մϴ�.");
		Zealot.beAttackZealot(this.power);
	}
	
	public void attack(Zergling zergling) {
		System.out.println(this.name + "��" + zergling.getName() + "�� ���� �մϴ�.");
		zergling.beAttacked(this.power);
	}
	//���۸��� ���� ���մϴ�.
	public void beAttacked(int power) {
		this.hp -=power;
		//
		if(this.hp <= 0) {
			System.out.println(this.name + "�̹� ����Ͽ����ϴ�.");
		   this.hp = 0;
		}
	}




}

