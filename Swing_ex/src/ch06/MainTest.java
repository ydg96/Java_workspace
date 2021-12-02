package ch06;

import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MinAmongUs extends JFrame{
	
	BufferedImage backgroundImage;
	BufferedImage amongImage1;
	BufferedImage amongImage2;
	CustomJPanel customJPanel;
	
	int among1XPoint =0;
	int among1YPoint =370;
	int among2XPoint =200;
	int among2YPoint =200;
	
	public MinAmongUs() {
		 initData();
		 setLayout();
		 addEventListener();
	}
	private void initData() {
		setTitle("미니 어몽어스");
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		try {
			backgroundImage =ImageIO.read(new File("background2.jpg"));
			amongImage1 = ImageIO.read(new File("among1.png"));
			amongImage1 = ImageIO.read(new File("among4.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println("파일이 없습니다");
		}
	}
	private void setLayout() {
		setVisible(true);
	}
	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
			
				int code =e.getKeyCode();
				switch(code){
				case KeyEvent.VK_UP:
					System.out.println("업");
					break;
				case KeyEvent.VK_DOWN:
					System.out.println("다운");
					break;
				case KeyEvent.VK_LEFT:
					System.out.println("왼쪽");
				case KeyEvent.VK_RIGHT:
					System.out.println("오른쪽");
				}
				//그림을 다시 그려라
				repaint();
			}
			
	});

	}
	private class CustomJPanel extends JPanel implements Runnable{
		@Override
		protected void paintComponent(Graphics g) {
	g.drawImage(backgroundImage, 0, 0, 600, 600, null);
	g.drawImage(amongImage1, among1XPoint, among1YPoint, 100, 100, null);
	g.drawImage(amongImage2, among2XPoint, among2YPoint, 100, 100, null);
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			boolean direcation =true;
			while(true) {
				if(direcation){
					among1XPoint = among1XPoint +10;
				}
			}
		}
	}
	
}




public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		new MinAmongUs();
		
	}

}
