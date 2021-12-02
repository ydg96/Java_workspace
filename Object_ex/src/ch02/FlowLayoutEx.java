package ch02;

import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
//
//public class FlowLayoutEx extends JFrame {
//
//	// 반복 : 배열 , ArrayList 
//	// 배열 , ArrayList 코드 수정 
//	private JButton button1; 
//	private JButton button2; 
//	private JButton button3; 
//	private JButton button4; 
//	private JButton button5; 
//	private JButton button6;
//	
//	public FlowLayoutEx() {
//		initData();
//		setInitLayout();
//	}
//	
//	private void initData() {
//		setTitle("Flow Layout 연습");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(500, 500);
//		setLayout(new FlowLayout(FlowLayout.LEFT, 80, 80));
//		// for 문으로 코드 수정 
//		button1 = new JButton("1");
//		button2 = new JButton("2");
//		button3 = new JButton("3");
//		button4 = new JButton("4");
//		button5 = new JButton("5");
//		button6 = new JButton("6");
//		
//	}
//	private void setInitLayout() {
//		setVisible(true);
//		// for문 코드 수정 
//		this.add(button1);
//		this.add(button2);
//		this.add(button3);
//		this.add(button4);
//		this.add(button5);
//		this.add(button6);
//	}
//	
//	// 메인함수 
//	public static void main(String[] args) {
//		new FlowLayoutEx(); 
//	}
//	
//}



public class FlowLayoutEx  extends JFrame{

	// 배열 --> 크기를 지정해야 한다.
		// ArrayList --> 크기를 지정할 필요 없다.
		JButton[] buttons = new JButton[6];
		
		public FlowLayoutEx() {
			initData();
			setInitLayout();
		}

		private void initData() {
			setTitle("FlowLayoutPractice");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창닫기 버튼 눌렀을때 메모리에서 해제하기. 하지 않으면 메모리낭비
			setSize(500, 500);
			setLayout(new FlowLayout(FlowLayout.LEFT, 80, 80));
			// arrayList --> 0 for문 동작하지 않을 수 있다.
			for (int i = 0; i < buttons.length; i++) {
				buttons[i] = new JButton(i + "");
			}
		}

		private void setInitLayout() {
			setVisible(true); // false로 할시 메모리엔 적재되지만 눈에 보이지는 않음.
			for (int i = 0; i < buttons.length; i++) {
				this.add(buttons[i]);
			}
		}

		public static void main(String[] args) {
			FlowLayoutEx f1 = new FlowLayoutEx();

		}
	


}
