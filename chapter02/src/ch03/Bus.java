package ch03;



public class Bus {

	//���� ��ȣ
	//���Ա�
	
	int busNumber;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	
	}
	public Bus(int busNumber, int money) {
		
		this.busNumber =busNumber;
		this.money = money;
		
	}
	public void showInfo() {
		System.out.println("������ ��ȣ��" + busNumber);
	
	}
	public void showMoney() {
		System.out.println("���� ���Ա���" + this.money+ "�Դϴ�.");
		
		
	}
}
