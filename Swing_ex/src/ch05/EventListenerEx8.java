package ch05;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;
import javax.swing.JTextArea;



class MyFrame8 extends JFrame {
	
	private JTextArea area;
	
		
	
	public MyFrame8(){
		initData();
        setInitLayout();
        addEventListener();
		}
	
	private void initData() {
		// TODO Auto-generated method stub

		setTitle("키 이벤트 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		area =new JTextArea();

	}

	private void setInitLayout() {
		// TODO Auto-generated method stub

		setVisible(true);
		add(area);
	}

	private void addEventListener() {
		// TODO Auto-generated method stub
		area.addKeyListener(new MYkeyListener());
	}
	
	private void display(KeyEvent e) {
		
		int keyCode = e.getKeyCode();
		area.append("keyCode: " + keyCode + "\n");
		
		//38방향키 위
		//40방향키 아래
		//static 변수
		if(keyCode == KeyEvent.VK_UP) {
			System.out.println("방향키 위로 눌러졌습니다.");
		}else if(keyCode == KeyEvent.VK_DOWN) {
			System.out.println("방향키 아래로 눌러졌습니다.");
		}else if(keyCode == KeyEvent.VK_LEFT) {
			System.out.println("방향키 왼쪽으로 눌러졌습니다.");
		}else if(keyCode == KeyEvent.VK_RIGHT) {
			System.out.println("방향키 오른쪽으로 눌러졌습니다.");
		}
		
	}
	private class MYkeyListener extends KeyAdapter{
		
		public void keyPressed(KeyEvent e) {
			display(e);
		}
	}
}

public class EventListenerEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyFrame8();
	}

}
