package ch04;


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame2 extends JFrame {
	BufferedImage backgroundImage; 
	BufferedImage imageIcon; 
	MyImagePanel imagePanel; 
	public MyFrame2() {
		initData();
		setInitLayout();
	}
	private void initData() {
		setTitle("�̹��� ��׶��� ����");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �̹����� ������ �ͼ� ����ϱ� 
		try {
			backgroundImage = ImageIO.read(new File("background2.jpg"));
			imageIcon = ImageIO.read(new File("among1.png"));
		} catch (IOException e) {
			System.out.println("������ �����ϴ�!");
			e.printStackTrace();
		}
		imagePanel = new MyImagePanel();
	} // end of initData 
	private void setInitLayout() {
		setVisible(true);
		setResizable(false);
		add(imagePanel);
	}
	// ���� Ŭ���� ���� 
	private class MyImagePanel extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundImage, 0, 0, 500, 500, null);
			g.drawImage(imageIcon, 200, 200, 100, 100, null);
		}
	} // end of MyImagePanel(���� Ŭ����) 
}

public class MainTest2 {
	public static void main(String[] args) {
		new MyFrame2();
	}
}



