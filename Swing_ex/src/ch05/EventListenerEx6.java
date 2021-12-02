package ch05;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

class MyFrame6 extends JFrame{
	public MyFrame6() {
		initData();
		setInitLayout();
		addEventLisyener();
	}

	private void initData() {
		// TODO Auto-generated method stub
		setTitle("어댑터 클래스 이용방법");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
	}

	private void setInitLayout() {
		// TODO Auto-generated method stub
		setVisible(true);
	}

	private void addEventLisyener() {
		// TODO Auto-generated method stub
		this.addMouseListener(new MYMouseListener());
	}
	//내부클래스
	private class MYMouseListener extends MouseAdapter{
		
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

			int x =e.getX();
			int y =e.getY();
			System.out.println("X :" + x);
			System.out.println("Y :" + y);
			}
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

			System.out.println("마우스가 root Container 안으로 들어 왔습니다.");
		
		}
		
		
	}
	
}




public class EventListenerEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyFrame6();
	}

}
