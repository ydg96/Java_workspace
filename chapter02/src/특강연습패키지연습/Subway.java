package Ư��������Ű������;

public class Subway {

	//ȣ����ȣ 
	int sNumber;
	//�°���
	int sp;
	//���Ա�
	int money;
	
	//������ - ȣ����ȣ�� ���� �� �ְ� ����� �ּ���.
	public Subway(int sNumber) {
		this.sNumber = sNumber;
	}
	
	//take �޼�������	
	//���ϰ� viod
	//�Ű� ���� int money
	public void take(int money) {
		this.money += money;
		sp++;
	}
	
	//showInfo �ż��� ����� �ּ���.
	public void showInfo(){
		System.out.println(sNumber+"ȣ���� �°���");
		System.out.println(sp +"���̰�");
		System.out.println("���Ա��� :"+this.money + "�Դϴ�.");
		
		
	}
	
}
