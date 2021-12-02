package ch05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ColorChangerFrame extends JFrame implements ActionListener{

	BorderLayout borderLayout;
	JPanel panel1;
	JPanel panel2;
	JButton button1;
	JButton button2;
	
	public ColorChangerFrame() {
		initData();
		setInitLayout();
		addEventListener();
	}
	private void initData() {
		setTitle("�̺�Ʈ ������ ����3");
		setSize(500,500);
		borderLayout =new BorderLayout();
		panel1 =new JPanel();
		panel1.setBackground(Color.GRAY);
		panel1.setPreferredSize(new Dimension(500,400));
		
		panel2 =new JPanel(new FlowLayout());
		
		button1 = new JButton("������");
		button2 = new JButton("�����");
		
	}
	private void setInitLayout() {
		setVisible(true);
		this.setLayout(borderLayout);
		add(panel1,BorderLayout.NORTH);
		add(panel2,BorderLayout.SOUTH);
		
		panel2.add(button1);
		panel2.add(button2);
	}
	private void addEventListener() {
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton targetBtn = (JButton)e.getSource();
		//if()
		if(targetBtn.getText().equals(button1.getText())) {
			panel1.setBackground(Color.red);
			
		}else {
			panel1.setBackground(Color.yellow);
		}
		//��ư 1���� �������ٸ�
		//panel1.setBackground(Color.red);
		//��ư 2���� �������ٸ�
		////panel2.setBackground(Color.yellow);
	}
	
}








public class EventListenerEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�͸�Ŭ����(�ν��Ͻ� ������ ���⋚���� ���������� �����ؼ� ����� �� ����)
		new ColorChangerFrame();
		//ColorChangeFrame ccf1 =new ColorChangeFrame
	}

}
