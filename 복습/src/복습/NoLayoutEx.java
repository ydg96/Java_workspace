 package 복습;

import java.awt.Font;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayoutEx extends JFrame {

	// ArrayList 사용하는 방법

	ArrayList<JButton> buttons = new ArrayList<JButton>();

	/*
	 * private JButton button1; private JButton button2; private JButton button3;
	 * private JButton button4; private JButton button5; private JButton button6;
	 */

	// 최소 버튼 3개이상 만들기
	// 원하는 좌표값에 올려주세요
	// 멤버변수 또는 생성자
	// 메서드

	public NoLayoutEx() {
		// TODO Auto-generated constructor stub

		initData();
		setInitLayout();
	}

	private void initData() {
		// TODO Auto-generated method stub
		setTitle("NoLAyout 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);

		for (int i = 0; i < 3; i++) {
			buttons.add(new JButton(i + ""));
		}
		/*
		 * button1 = new JButton("1"); button2 = new JButton("2"); button3 = new
		 * JButton("3"); button4 = new JButton("4"); button5 = new JButton("5"); button6
		 * = new JButton("6");
		 */
	}

	private void setInitLayout() {
		// TODO Auto-generated method stub
		setVisible(true);
		setLayout(null);

		buttons.get(0).setSize(50, 50);
		buttons.get(0).setLocation(50, 50);

		buttons.get(1).setSize(100, 100);
		buttons.get(1).setLocation(100, 100);

		buttons.get(2).setSize(150, 150);
		buttons.get(2).setLocation(150, 150);

		for (int i = 0; i < buttons.size(); i++) {
			buttons.get(i).setSize(50, 50);
			buttons.get(i).setLocation(setupPosition(50 ,i),setupPosition( 50 ,i));
			add(buttons.get(i));
		}

		// 버튼에 크기를 직접 지정해야 합니다.
		/*
		 * button1.setSize(20,20); button1.setLocation(50, 50);
		 * 
		 * button2.setSize(50,50); button2.setLocation(80, 80);
		 * 
		 * button3.setSize(80,80); button3.setLocation(100, 100);
		 * 
		 * button4.setSize(100,100); button4.setLocation(110, 110);
		 * 
		 * button5.setSize(110,110); button5.setLocation(120, 120);
		 * 
		 * button6.setSize(120,120); button6.setLocation(250, 250);
		 */

		/*
		 * add(button1); add(button2); add(button3); add(button4); add(button5);
		 * add(button6);
		 */

	}

	private int setupPosition(int size, int index) {
		int result = (index + 1) * size;
		return result;
	}

	// 메인함수
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new NoLayoutEx();
	}

}
