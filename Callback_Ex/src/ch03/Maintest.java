package ch03;

import ch02.Activity1;
import ch02.Activity2;

public class Maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         Activity1 activity1 =  new Activity1("첫번째 화면입니다.");
		 
		 Activity2 activity2  = new Activity2("두번쨰 화면입니다.");
		 //메서드를 사용해서 콜백 연결하기
		 
		 activity2.setCallbackCheckPosition(activity1.callbackCheckPosition);
}
}