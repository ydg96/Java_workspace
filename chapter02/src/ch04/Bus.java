package ch04;

public class Bus {

	int busNumber;
	int passengerComunt;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		//passengerComunt = passengerComunt + 1;
		passengerComunt++;
		
	}
	public void showInfo() {
		System.out.println(busNumber + "���� �°���");
		System.out.println(passengerComunt + "�� �̰�");
		System.out.println("���Ա��� " + money + "�Դϴ�.");
	}
	
	
}
