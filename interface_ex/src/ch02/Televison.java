package ch02;

import ch01.HomeAppliances;

public class Televison extends HomeAppliances implements RemoteController{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
	}
	

}
