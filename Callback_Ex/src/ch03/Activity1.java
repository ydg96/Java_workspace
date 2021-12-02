package ch03;

import java.awt.Color;

import javax.swing.JPanel;

import ch02.CallbackCheckPosition;

public class Activity1 extends BaseActivity{

	
	String name;
	JPanel panel;
	CallbackCheckPosition callbackCheckPosition  =(CallbackCheckPosition) new CallbackCheckPosition() {
		
		@Override
		public void checkPosition(int x, int y) {
			// TODO Auto-generated method stub
			System.out.println("X :" + x);
			System.out.println("Y :" + y);
		}
	};

	public Activity1(String name) {
		this.name =name;
		initData();
		setLayout();
	}
	private void initData() {
		setTitle(name);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel =new JPanel();
		
	}
	private void setLayout() {
		setVisible(true);
		add(panel);
		panel.setBackground(Color.BLACK);
	}
	


}