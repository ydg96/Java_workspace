package ch02;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;





import javax.swing.JButton;
import javax.swing.JFrame;




public class NoLayoutEx extends JFrame{

	ArrayList<JButton>buttons =new ArrayList<JButton>();
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	//최소버튼 3개이상 만들기
	//원하는 좌표값에 올려주세요
	
	//멤버 변수
	//생성자
	//메서드
	public NoLayoutEx() {
		initData();
		setInitLayout();
	}
	
	private void initData() {
		setTitle("No Layout 연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		for (int i = 0; i <3; i++) {
			buttons.add(new JButton(i+""));
		}
		button1 =new JButton("1");
		button1 =new JButton("2");
		button1 =new JButton("3");
		
	}
	private void setInitLayout() {
		setVisible(true);
		setLayout(null);
	
	//버튼에 크기를 직접 지정해야 합니다.
		
   // buttons.get(0).setSize(50,50);
   // buttons.get(0).setLocation(50,50);
	
   // buttons.get(1).setSize(100,100);
   // buttons.get(1).setLocation(150,150);
    
  //  buttons.get(2).setSize(150,150);
  //  buttons.get(2).setLocation(200,200);
	for(int i =0; i< buttons.size(); i++) {
		buttons.get(i).setSize(50,50);
		buttons.get(i).setLocation(setupPosition(50, i),setupPosition(50,i));
		add(buttons.get(i));
	}
	}
	
	private int setupPosition(int size,int index) {
		int result =(index + 1)*size;
		return result;
	}
	//메인함수
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new NoLayoutEx();
	}

}
