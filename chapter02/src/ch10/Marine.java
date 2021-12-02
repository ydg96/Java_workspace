package ch10;

public class Marine {

	private String name;
	private int power;
	private int hp;
	
	//������
	
	public Marine(String name) {
		this.name =name;
		this.power=5;
		this.hp =100;
	}
	public String getName() {
		return this.name;
	}
    public int getPower(){
    	return this.power;
    }
 
    public int getHp() {
    	return this.hp;
}
    public void showInfo() {
		System.out.println("===����â==="+(this.name));
		System.out.println("�̸� " + this.name);
		System.out.println("���ݷ� " + this.power);
		System.out.println("ü�� " + this.hp);
		System.out.println("=======================");
    }   
    //������ ������ ���� �մϴ�.
    public void attackZealot(Zealot zealot){
    	System.out.println(this.name + "�� ������ �����մϴ�.");
    	zealot.beAttackZealot(this.power);
    }
    //������ ���۸��� �����մϴ�.
    public void attackZergling(Zergling zergling) {
    	System.out.println(this.name + "�� ���۸��� �����մϴ�.");
    }
    public void attack(Zergling Zergling) {
		System.out.println(this.name + " ��" + Zergling.getName() + " �� ���� �մϴ�.");
		Zergling.beAttacked(this.power);
    }
    public void attack(Zealot Zealot) {
		System.out.println(this.name + "��" + Zealot.getName() + "�� ���� �մϴ�.");
		Zealot.beAttackZealot(this.power);
    }
    
    
    
    
    
    
    
    
    
    //������ ������ ���մϴ�.
    public void beAttackMarine(int power) {
		this.hp -= power;
		if(this.hp <= 0) {
			System.out.println(this.name + " �� ����Ͽ����ϴ�.");
			this.hp =0;
		}
    }
}