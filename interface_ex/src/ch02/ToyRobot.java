package ch02;

import ch01.HomeAppliances;

public class ToyRobot extends HomeAppliances implements RemoteController,SoundEffect {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("�峭�� �κ��� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("�峭�� �κ��� ���ϴ�.");
	}
	public void notification() {
		System.out.println("�η�� ��~!~");
	}

}
