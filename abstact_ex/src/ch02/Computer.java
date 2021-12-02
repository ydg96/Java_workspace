package ch02;

public abstract class Computer {

	//추상메서드
	public abstract void display();
	
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 킵니다.");
	}
	public void trunOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
}
