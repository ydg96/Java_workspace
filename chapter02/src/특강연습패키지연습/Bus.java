package Ư��������Ű������;

public class Bus {

	//������ȣ
	//�°� ��
	//���Ա�
	int busNumber;
	int passengerCounter;
	int money;
	
	
	//������ : ��ü ������(���� ��ȣ�� �ʱ�ȭ)
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	
	//�޼���
	//take 
	//���ϰ� void
	//�Ű������� int money
	public void take(int money) {
		this.money += money;
    //this.money = money + money;
	passengerCounter++;
	
	
	}
	
	//showInfo()
	//��������� Ȱ���ؼ� ȭ�鿡 ���
	public void showInfo() {
		System.out.println(busNumber + "�� �� �°���");
		System.out.println(passengerCounter + "�� �̰�");
		System.out.println("���Ա���: " +  this.money + "�Դϴ�.");
		
	}
}
