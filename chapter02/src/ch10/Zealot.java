package ch10;

public class Zealot {

	private String name;
	private int power;
	private int hp;
	public Zealot(String name) {
		// TODO Auto-generated constructor stub
	this.name = name;
	this.power =10;
	this.hp = 100;
	}
	
	//getter
	public String getName() {
		return this.name;
	}
    public int getPower(){
    	return this.power;
    }
 
    public int getHp() {
    	return this.hp;
    }	
    	public void showInfo(){
    		System.out.println("===����â==="+(this.name));
    		System.out.println("�̸� " + this.name);
    		System.out.println("���ݷ� " + this.power);
    		System.out.println("ü�� " + this.hp);
    		System.out.println("=======================");
    		}
    	//������ ������ ���� �մϴ�.
    	public void attackMarine(Marine marine) {
    		System.out.println(this.name + "�� ������ �����մϴ�.");
    		marine.beAttackMarine(this.power);
    	}
    	//������ ���۸��� ���� �մϴ�.
    	public void attackZergling(Zergling zergling) {
    		System.out.println(this.name + "�� ���۸��� �����մϴ�");
    		zergling.beAttacked(this.power);
    	}
    	public void attack(Zergling Zergling) {
    		System.out.println(this.name + "��" + Zergling.getName() + "�� ���� �մϴ�.");
    		Zergling.beAttacked(this.power);
    	}
    	
    	//������ ������ ���մϴ�.
    	public void beAttackZealot(int power) {
    		this.hp -= power;
    	   if (this.hp <= 0) {
    		   System.out.println(this.name + "����Ͽ����ϴ�.");
    	       this.hp =0;
    	   }
    	   
    	
    	
    	}
    	
    

}







