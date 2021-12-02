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
    		System.out.println("===정보창==="+(this.name));
    		System.out.println("이름 " + this.name);
    		System.out.println("공격력 " + this.power);
    		System.out.println("체력 " + this.hp);
    		System.out.println("=======================");
    		}
    	//질럿이 마인을 공격 합니다.
    	public void attackMarine(Marine marine) {
    		System.out.println(this.name + "이 마린을 공격합니다.");
    		marine.beAttackMarine(this.power);
    	}
    	//질럿이 저글리을 공격 합니다.
    	public void attackZergling(Zergling zergling) {
    		System.out.println(this.name + "이 저글링을 공격합니다");
    		zergling.beAttacked(this.power);
    	}
    	public void attack(Zergling Zergling) {
    		System.out.println(this.name + "이" + Zergling.getName() + "을 공격 합니다.");
    		Zergling.beAttacked(this.power);
    	}
    	
    	//질럿이 공격을 당합니다.
    	public void beAttackZealot(int power) {
    		this.hp -= power;
    	   if (this.hp <= 0) {
    		   System.out.println(this.name + "사망하였습니다.");
    	       this.hp =0;
    	   }
    	   
    	
    	
    	}
    	
    

}







