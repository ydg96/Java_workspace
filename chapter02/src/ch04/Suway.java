package ch04;

public class Suway {

	int lineNumber;
	int passergerCount;
	int money;
	
	public Suway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void take(int money) {
		this.money = money;
		this.passergerCount++;
	}
	public void showInfo() {
		System.out.println(lineNumber + "호선의 승객은");
		System.out.println(passergerCount + "명 이고");
		System.out.println("수입금은 " + money + "입니다.");
	}
	}

