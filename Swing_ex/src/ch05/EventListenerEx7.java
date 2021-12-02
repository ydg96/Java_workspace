package ch05;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

class MyFrame7 extends JFrame implements KeyListener {

	private JTextArea area;

	public MyFrame7() {
		initData();
		setLayout();
		addEventListener();
	}

	private void initData() {
		setTitle("키 이벤트 연습");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		area = new JTextArea();
	}

	private void setLayout() {
		setVisible(true);
		add(area);
	}

	private void addEventListener() {
		area.addKeyListener(this);

	}

	private void display(KeyEvent e) {
		int keyCode = e.getKeyCode();
		area.append("keyCode: " + keyCode + "\n");
	}

	// 문자를 눌렀을때 호출,문자키에만 반응 합니다.
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		//display(e);

	}

	// 키보드를 눌렀을때,모든 키보드에 반응 합니다.
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		display(e);

		// char c = e.getKeyChar();
		// int keyCode =e.getKeyCode();

		// System.out.println("C:" + c);
		// System.out.println("keyCode:" + keyCode);
		// area.setText(keyCode + "");
		// area.append("keyCode: " + keyCode + "\n");
	}

	// 키보드를 땠을때 호출,모든 키보드에 반응 합니다.
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//display(e);

	}

}

public class EventListenerEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyFrame7();
	}

}
