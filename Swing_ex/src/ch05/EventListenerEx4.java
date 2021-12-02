package ch05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame4 extends JFrame {
	JButton button;

	public MyFrame4() {
		initData();
		setInitLayout();
		addEventListener();
	}

	private void initData() {

		setTitle("�͸�����ü��� ����");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button =new JButton("��ư 1");
	}

	private void setInitLayout() {

		setVisible(true);
		setLayout(new FlowLayout());
		add(button);
	}

	private void addEventListener() {

		//�͸� ���� ��ü
		//��ȸ���� �������̽��� �͸� ��ü�� ���� ����� �� �ִ�.
		//���� Ŭ���� -->�͸� ���� Ŭ����
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("��ư�� Ŭ����");
			}
		});
	}

}

public class EventListenerEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyFrame4();
	}

}
