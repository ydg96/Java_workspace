package ch01;

import ch02.RemoteController;

public class ToyRobot extends HomeAppliances implements RemoteController{

	String name; //초기값 -> null
	//int -> 0
	//double -> 0.0
	
	public void turnOn() {
		System.out.println("장난감 로봇을 켭니다.");
	}
	public void turnOff() {
		System.out.println("장난감 로봇을 끕니다.");
	}
}
