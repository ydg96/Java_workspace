package ch03;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;





public class MyFrame2 extends JFrame{
	JPanel panel1; 
	JPanel panel2;
	
	JButton button1; 
	JButton button2;
	JButton button3; 
	JButton button4;
	JButton button5; 
	JButton button6;

	// ��ư 4�� ����� 2 -> p1 , 2 ->  p2
		// FlowLayout ���򰣰��ֱ�, �������� �ֱ�, 
		
		public MyFrame2() {
			initData();
			setInitLayout();
		}
		private void initData() {
			setTitle("�г� ����");
			setSize(400, 400);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			panel1 = new JPanel();
			panel1.setBackground(Color.yellow);
			panel2 = new JPanel();
			panel2.setBackground(Color.blue);
			
			button1 = new JButton("��ư 1");
			button2 = new JButton("��ư 2");
			button3 = new JButton("��ư 3");
			button4 = new JButton("��ư 4");
			button5 = new JButton("��ư 5");
			button6 = new JButton("��ư 6");
		}
		
		private void setInitLayout() {
			setVisible(true);
			this.setLayout(new GridLayout(2, 1));
			this.add(panel1);
			this.add(panel2);
			panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 100, 50));
			panel2.setLayout(new FlowLayout(FlowLayout.RIGHT, 100, 50));
			
			panel1.add(button1);
			panel1.add(button2);
			panel1.add(button3);
			
			panel2.add(button4);
			panel2.add(button5);
			panel2.add(button6);
			
		}
	





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyFrame2();
	}

}
