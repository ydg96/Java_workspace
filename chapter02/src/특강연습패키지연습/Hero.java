package Ư��������Ű������;

public class Hero {

	private String name;
	private int hp;
	private int power;
	private double defense;
	private int level;
	
	//getter , setter �޼��带 ����� �ּ���.
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name == null || name == "" ||name.length() < 2){
			System.out.println("�߸��� �Է� �Դϴ�.�̸��� �ٽ� ���Ͻÿ�.");
		}
	}
}
