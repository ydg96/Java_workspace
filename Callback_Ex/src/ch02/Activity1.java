package ch02;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Activity1 extends JFrame{
	
	
	String name;
	JPanel panel;
	public CallbackCheckPosition callbackCheckPosition =new CallbackCheckPosition() {
		
		@Override
		public void checkPosition(int x, int y) {
			
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
		panel.setBackground(Color.blue);
	}
	
	
	

}
