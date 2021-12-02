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
		System.out.println(busNumber + "번의 승객은");
		System.out.println(passengerComunt + "명 이고");
		System.out.println("수입금은 " + money + "입니다.");
	}
	
	
}
