package ch05;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame9 extends JFrame implements KeyListener {

	BufferedImage backgroundImage;
	BufferedImage imageIcon;
	MyImagePanel imagePanel;
	
	int xpoint;
	int ypoint;

	public MyFrame9() {
		initDate();
		setInitLayout();
		addEventListener();
	}

	private void initDate() {
		// TODO Auto-generated method stub

		setTitle("이미지 백그라운드 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500,500);
		
		try {
			backgroundImage = ImageIO.read(new File("background2.jpg"));
			imageIcon =ImageIO.read(new File("among1.png"));
			System.out.println("파일을 정상적으로 가지고 왔습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		imagePanel =new MyImagePanel();
	}

	private void setInitLayout() {
		// TODO Auto-generated method stub

		this.setVisible(true);
		add(imagePanel);
	}

	private void addEventListener() {
		// TODO Auto-generated method stub

		this.addKeyListener(this);
	}
	//내부클래스
	private class MyImagePanel extends JPanel{
		
	}
	protected void piantComponent(Graphics g) {
		super.paintComponents(g);
		g.drawImage(backgroundImage, 0, 0, 500, 500,null);
		g.drawImage(imageIcon,xpoint , ypoint , 100, 100, null);
		System.out.println("Log: paintComponent 메서드 실행");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {

		int keyCode =e.getKeyCode();
		System.out.println("keyCode:" + keyCode);
		if(keyCode ==KeyEvent.VK_UP) {
			ypoint = (ypoint <0)?0 : ypoint -10;
		}else if(keyCode ==KeyEvent.VK_DOWN) {
      		ypoint = (ypoint> 500)?0 : ypoint -10;
        }else if(keyCode ==KeyEvent.VK_LEFT) {
			ypoint = (ypoint <0)?0 : ypoint -10;
		}else if(keyCode ==KeyEvent.VK_RIGHT) {
      		ypoint = (ypoint> 500)?0 : ypoint -10;
		}
		repaint();
	}
	

	@Override
	public void keyReleased(KeyEvent e) {
	}

}

public class EventListenerEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		new MyFrame9();
	}

}
