package ch03;

import ch02.Activity1;
import ch02.Activity2;

public class Maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         Activity1 activity1 =  new Activity1("ù��° ȭ���Դϴ�.");
		 
		 Activity2 activity2  = new Activity2("�ι��� ȭ���Դϴ�.");
		 //�޼��带 ����ؼ� �ݹ� �����ϱ�
		 
		 activity2.setCallbackCheckPosition(activity1.callbackCheckPosition);
}
}