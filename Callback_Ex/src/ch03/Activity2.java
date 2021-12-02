package ch03;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ch02.CallbackCheckPosition;

public class Activity2 extends  BaseActivity{
	String name;
	JPanel panel;
	
	CallbackCheckPosition callbackCheckPosition;
	public void setcallbackCheckPosition(CallbackCheckPosition callbackCheckPosition) {
		this.callbackCheckPosition =callbackCheckPosition;
		
	}
	public Activity2(String name) {
		this.name =name;
		initData();
		setLayout();
		addEvnetListener();
		
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
		panel.setBackground(Color.DARK_GRAY);
	}
	private void addEvnetListener() {
		this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int x =e.getX();
				int y =e.getY();
				callbackCheckPosition.checkPosition(x, y);
			}
	});
	
	
	}
}
