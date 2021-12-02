package ch03;

import javax.swing.JFrame;

import ch02.Activity1;
import ch02.Activity2;

public class BaseActivity extends JFrame {
	public static void main(String[] args) {
	Activity1 activity1 =  new Activity1("ø¢∆º∫Ò∆º 1");
	 
	Activity2 activity2  = new Activity2("ø¢∆º∫Ò∆º 2");
	 
	 activity2.setCallbackCheckPosition(activity1.callbackCheckPosition);
		

}

}
