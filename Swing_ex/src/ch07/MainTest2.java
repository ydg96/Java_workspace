package ch07;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame{
	
	private static final Component myPanel = null;



	public MyFrame() {
		initData();
		setInitLayout();
	}

private void initData() {
	setSize(600,400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
}
private void setInitLayout() {
	setVisible(true);
	setBackground(Color.gray);
	add(myPanel);
}



private class MyPanel extends JPanel{
	public void paint(Graphics g) {
		Font font =new Font("궁서체",Font.BOLD,20);
		g.setFont(font);
		g.drawString("로또 버튼을 클릭하세요", 180, 180);
	}
}

public class MainTest2 {

	public static void main(String[]age) {
		new MyFrame();
		
	}
}
}