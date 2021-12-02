package ch01;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;


public class NoLayoutEx extends JFrame {

	//최소 버튼 3개 이상 만들기

	ArrayList<JButton>buttons =new ArrayList<JButton>();
	
	//private JButton button1;
	//private JButton button2;
	//private JButton button3;

	
	//원하는 좌표값에 올려 주세요
	
	
	// 멤버변수
	// 생성자
	// 메서드
	public NoLayoutEx() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("NoLayout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		for (int i = 0; i < 3; i++) {
			buttons.add(new JButton(i + ""));
		}
	//	button1 = new JButton("1");
	//	button2 = new JButton("2");
	//	button3 = new JButton("3");
}

	private void setInitLayout() {
        setVisible(true);
		setLayout(null);

		buttons.get(0).setSize(50,50);
		buttons.get(0).setLocation(50,50);
		
		buttons.get(1).setSize(100,100);
		buttons.get(1).setLocation(150,150);
		
		buttons.get(2).setSize(150,150);
		buttons.get(2).setLocation(250,250);
		
		for (int i = 0; i < buttons.size(); i++) {
			add(buttons.get(i));
		}
		//버튼에 크기를 직접 지정해야 합니다.
		//button1.setSize(50,50);
		//button1.setLocation(50,50);
		
		//button2.setSize(100,100);
		//button2.setLocation(150,150);
		
		//button3.setSize(150,150);
		//button3.setLocation(250,250);
		
		//add(button1);
		//add(button2);
		//add(button3);
	}

	// 메인함수
	public static void main(String[] args) {

		new NoLayoutEx();
	  
	}

}
