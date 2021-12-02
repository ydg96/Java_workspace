package 특강연습패키지연습;

public class Bus {

	//버스번호
	//승객 수
	//수입금
	int busNumber;
	int passengerCounter;
	int money;
	
	
	//생성자 : 객체 생성시(버스 번호를 초기화)
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	
	//메서드
	//take 
	//리턴값 void
	//매개변수는 int money
	public void take(int money) {
		this.money += money;
    //this.money = money + money;
	passengerCounter++;
	
	
	}
	
	//showInfo()
	//멤버변수를 활용해서 화면에 출력
	public void showInfo() {
		System.out.println(busNumber + "번 의 승객은");
		System.out.println(passengerCounter + "명 이고");
		System.out.println("수입금은: " +  this.money + "입니다.");
		
	}
}
