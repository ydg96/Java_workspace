package ch02;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

//호출자(콜리)
public class Activity2 extends JFrame{
	String name;
	JPanel panel;
	//주소값을 담아 둔다.
	CallbackCheckPosition callbackCheckPosition;
	public void setCallbackCheckPosition(CallbackCheckPosition callbackCheckPosition) {
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
		panel.setBackground(Color.yellow);
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