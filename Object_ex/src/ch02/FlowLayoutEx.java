package ch02;

import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
//
//public class FlowLayoutEx extends JFrame {
//
//	// �ݺ� : �迭 , ArrayList 
//	// �迭 , ArrayList �ڵ� ���� 
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
//		setTitle("Flow Layout ����");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(500, 500);
//		setLayout(new FlowLayout(FlowLayout.LEFT, 80, 80));
//		// for ������ �ڵ� ���� 
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
//		// for�� �ڵ� ���� 
//		this.add(button1);
//		this.add(button2);
//		this.add(button3);
//		this.add(button4);
//		this.add(button5);
//		this.add(button6);
//	}
//	
//	// �����Լ� 
//	public static void main(String[] args) {
//		new FlowLayoutEx(); 
//	}
//	
//}



public class FlowLayoutEx  extends JFrame{

	// �迭 --> ũ�⸦ �����ؾ� �Ѵ�.
		// ArrayList --> ũ�⸦ ������ �ʿ� ����.
		JButton[] buttons = new JButton[6];
		
		public FlowLayoutEx() {
			initData();
			setInitLayout();
		}

		private void initData() {
			setTitle("FlowLayoutPractice");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�ݱ� ��ư �������� �޸𸮿��� �����ϱ�. ���� ������ �޸𸮳���
			setSize(500, 500);
			setLayout(new FlowLayout(FlowLayout.LEFT, 80, 80));
			// arrayList --> 0 for�� �������� ���� �� �ִ�.
			for (int i = 0; i < buttons.length; i++) {
				buttons[i] = new JButton(i + "");
			}
		}

		private void setInitLayout() {
			setVisible(true); // false�� �ҽ� �޸𸮿� ��������� ���� �������� ����.
			for (int i = 0; i < buttons.length; i++) {
				this.add(buttons[i]);
			}
		}

		public static void main(String[] args) {
			FlowLayoutEx f1 = new FlowLayoutEx();

		}
	


}
