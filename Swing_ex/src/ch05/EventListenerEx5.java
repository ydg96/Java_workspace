package ch05;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
//class MyFrame5 extends JFrame implements MouseListener
class MyFrame5 extends JFrame{


	JLabel label;

	public MyFrame5() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("마우스 이벤트");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		label = new JLabel("Hello");
		label.setSize(50, 50);
		label.setBackground(Color.blue);
		System.out.println(label.getBounds());
	}

	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
		add(label);
		label.setLocation(50, 50);
	}

	private void addEventListener() {
		//this.addMouseListener(this);
		//익명 구현객체로 만들기 연습!!
	
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
	                System.out.println("마우스 버튼을 눌렀다가 땠습니다.");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("마우스 버튼이 눌러 졌습니다.");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("마우스가 나갔습니다.");
				//setForeground....
				//opa --> ture
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("마우스가 들어 왔습니다.");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
       
	}

	// 마우스가 클릭 되었을떄 실행되는 메서드
/*	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX() + ":X좌표값");
		System.out.println(e.getY() + ":Y좌표값");
		System.out.println(getHeight() + ": getHeight()");
		System.out.println(getWidth() + ": getWidth()");
		label.setLocation(e.getX(), e.getY() - label.getBounds().height);
	}
	// 마우스가 누르고 잇을때 실행되는 메서드
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	// 마우스를 눌렀다가 떨어지는 순간 실행되는 메서드
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	// 마우스가 들어왔을때 실행되는 메서드
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	// 마우스가 나갔을때 실행되는 메서드
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}*/
}
public class EventListenerEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyFrame5();
	}

}
