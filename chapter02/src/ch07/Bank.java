package ch07;

public class Bank {

	//정보 은닉
	private int balance;
	
	//입금
	public void deposit(int money) {
		this.balance += money;
	}

	//출금
	public void whitdraw(int money) {
		this.balance -= money;
	}

	//정보
	public void showInfo() {
		System.out.println("현재 잔액은:" + this.balance + "입니다.");
		
	}


}
