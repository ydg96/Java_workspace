package ch05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


class MyFrame1 extends JFrame implements ActionListener{
	
	JButton button;
	
    public MyFrame1() {
		initData();
		setInitLayout();
		addEventListenener();
	}
	private void initData() {
		setTitle("�̺��� ������ ����1");
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button =new JButton("button1");
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button);
	}
	private void addEventListenener() {
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�ݹ�޼��� ����");
		System.out.println("��ư�� Ŭ�� �Ǿ����ϴ�.");
		System.out.println(e.toString());
	}
}









public class EventListenerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyFrame1();
		
	}

}
