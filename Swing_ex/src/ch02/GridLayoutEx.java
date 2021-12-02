package ch02;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;



public class GridLayoutEx extends JFrame{

	// �迭�� ���� --> ArrayList ���� �ڵ� ���� 
	
		// ���� ��� 
		ArrayList<JButton> buttons = new ArrayList<>();

		private final int MAX_COUNT = 5;
		
		public GridLayoutEx() {
			initData();
			setInitLayout();
		}
		
		private void initData() {
			setTitle("GridLayout ����");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(400, 400);
			for (int i = 0; i < MAX_COUNT; i++) {
				buttons.add(new JButton(i + ""));
			}
		}

		private void setInitLayout() {
			setVisible(true);
			setLayout(new GridLayout(2, 3));
			for (int i = 0; i < MAX_COUNT; i++) {
				this.add(buttons.get(i));
			}
		}

		// ���� �Լ�
		public static void main(String[] args) {
			new GridLayoutEx();
		}



}
