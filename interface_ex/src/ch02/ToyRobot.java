package ch02;

import ch01.HomeAppliances;

public class ToyRobot extends HomeAppliances implements RemoteController,SoundEffect {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Àå³­°¨ ·Îº¿À» ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Àå³­°¨ ·Îº¿À» ²ü´Ï´Ù.");
	}
	public void notification() {
		System.out.println("µÎ·ç·ç Äç~!~");
	}

}
