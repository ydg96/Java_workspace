package ch01;

import ch02.RemoteController;

public class ToyRobot extends HomeAppliances implements RemoteController{

	String name; //�ʱⰪ -> null
	//int -> 0
	//double -> 0.0
	
	public void turnOn() {
		System.out.println("�峭�� �κ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�峭�� �κ��� ���ϴ�.");
	}
}
