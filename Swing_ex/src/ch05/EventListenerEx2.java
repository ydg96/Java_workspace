package ch05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame2 extends JFrame implements ActionListener{
	
	
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	
	
	public MyFrame2() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setTitle("�̺�Ʈ ������ ����2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		button1 =new JButton("buttons1");
		button2 =new JButton("buttons2");
		button2 =new JButton("buttons3");
		button2 =new JButton("buttons4");
		button2 =new JButton("buttons5");
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
	}
	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("ActionEvent �Ͼ�� ���� �޼��忡�� ���۵�!!!");
		//System.out.println(e.toString());
		JButton cilckedButton =(JButton)e.getSource();
		System.out.println(cilckedButton.getText());
		
		//if���� ����ؼ�
		//equals
		if(cilckedButton.getText().equals(this.button1.getText())){
			System.out.println("1�� ��ư�� Ŭ���Ǿ����ϴ�.");
		}else{
			System.out.println("2�� ��ư�� Ŭ���Ǿ����ϴ�.");
		}//else{
			//System.out.println("3�� ��ư�� Ŭ���Ǿ����ϴ�.");
		}
	}
	



public class EventListenerEx2 {
public static void main(String[] args) {
		// TODO Auto-generated method stub

	new MyFrame2();
	}

}
