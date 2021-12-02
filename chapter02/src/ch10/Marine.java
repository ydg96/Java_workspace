package ch10;

public class Marine {

	private String name;
	private int power;
	private int hp;
	
	//생성자
	
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
		System.out.println("===정보창==="+(this.name));
		System.out.println("이름 " + this.name);
		System.out.println("공격력 " + this.power);
		System.out.println("체력 " + this.hp);
		System.out.println("=======================");
    }   
    //마린이 질럿을 공격 합니다.
    public void attackZealot(Zealot zealot){
    	System.out.println(this.name + "이 질럿을 공격합니다.");
    	zealot.beAttackZealot(this.power);
    }
    //마린이 저글링을 공격합니다.
    public void attackZergling(Zergling zergling) {
    	System.out.println(this.name + "이 저글링을 공격합니다.");
    }
    public void attack(Zergling Zergling) {
		System.out.println(this.name + " 이" + Zergling.getName() + " 을 공격 합니다.");
		Zergling.beAttacked(this.power);
    }
    public void attack(Zealot Zealot) {
		System.out.println(this.name + "이" + Zealot.getName() + "을 공격 합니다.");
		Zealot.beAttackZealot(this.power);
    }
    
    
    
    
    
    
    
    
    
    //마린이 공격을 당합니다.
    public void beAttackMarine(int power) {
		this.hp -= power;
		if(this.hp <= 0) {
			System.out.println(this.name + " 은 사망하였습니다.");
			this.hp =0;
		}
    }
}