package ch02;

import ch01.HomeAppliances;

public class Refrigerator extends HomeAppliances implements RemoteController,SoundEffect{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("����� �մϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
	    System.out.println("����� ���ϴ�.");
	}

	@Override
	public void notification() {
		// TODO Auto-generated method stub
		System.out.println("�츮����~~!@@");
	}

}
