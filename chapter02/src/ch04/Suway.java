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
		System.out.println(lineNumber + "ȣ���� �°���");
		System.out.println(passergerCount + "�� �̰�");
		System.out.println("���Ա��� " + money + "�Դϴ�.");
	}
	}

