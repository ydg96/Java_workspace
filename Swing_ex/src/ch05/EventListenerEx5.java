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
		setTitle("���콺 �̺�Ʈ");
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
		//�͸� ������ü�� ����� ����!!
	
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
	                System.out.println("���콺 ��ư�� �����ٰ� �����ϴ�.");
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("���콺 ��ư�� ���� �����ϴ�.");
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
				System.out.println("���콺�� �������ϴ�.");
				//setForeground....
				//opa --> ture
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println("���콺�� ��� �Խ��ϴ�.");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
       
	}

	// ���콺�� Ŭ�� �Ǿ����� ����Ǵ� �޼���
/*	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX() + ":X��ǥ��");
		System.out.println(e.getY() + ":Y��ǥ��");
		System.out.println(getHeight() + ": getHeight()");
		System.out.println(getWidth() + ": getWidth()");
		label.setLocation(e.getX(), e.getY() - label.getBounds().height);
	}
	// ���콺�� ������ ������ ����Ǵ� �޼���
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	// ���콺�� �����ٰ� �������� ���� ����Ǵ� �޼���
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	// ���콺�� �������� ����Ǵ� �޼���
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	// ���콺�� �������� ����Ǵ� �޼���
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
