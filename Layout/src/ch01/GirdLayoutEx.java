package ch01;


import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GirdLayoutEx extends JFrame{

	//�迭�� ����
	//JButton[]buttons =new JButton[6];
	
	//ArrayList �κ���
	ArrayList<JButton>buttons =new ArrayList<>();
	private final int MAX_COUNT =6;
	
	//private JButton button1;
	//private JButton button2;
	//private JButton button3;
	//private JButton button4;
	//private JButton button5;
	//private JButton button6;
	
	public GirdLayoutEx() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("GridLayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,400 );
	//	button1 = new JButton("��");
		//button2 = new JButton("��");
		//button3 = new JButton("��");
	//	button4 = new JButton("��");
	//	button5 = new JButton("��");
		//button6 = new JButton("��");
		for (int i = 0; i < MAX_COUNT; i++) {
			buttons.add(new JButton(i + ""));
		}
	
	}


	private void setInitLayout() {
		setVisible(true);
		setLayout(new GridLayout(2,3));
		//add(button1);
		//add(button2);
		//add(button3);
		//add(button4);
		//add(button5);
		//add(button6);
		for (int i = 0; i <  MAX_COUNT; i++) {
			this.add(buttons.get(i));
		}
	}














	//�����Լ�
	public static void main(String[] args) {

		new GirdLayoutEx();
	}

}
