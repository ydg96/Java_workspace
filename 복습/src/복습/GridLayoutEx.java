package ����;


import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame{
	
	//�迭 ArrayList
 
	ArrayList<JButton>buttons =new ArrayList<>();
	private final int MAX_COUNT =6;
	
	
	public GridLayoutEx() {
		initData();
		setInitLayout();
		
		}

	private void initData() {
		// TODO Auto-generated method stub
		setTitle("GridLayout ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,400);
		for (int i = 0; i < MAX_COUNT; i++) {
			buttons.add(new JButton(i +""));
		}
		
	}

	private void setInitLayout() {
		// TODO Auto-generated method stub
		setVisible(true);
		setLayout(new GridLayout(2,3));
		for (int i = 0; i < MAX_COUNT; i++) {
			this.add(buttons.get(i));
		}
		
	}

	//�����Լ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new GridLayoutEx();
	}

}
