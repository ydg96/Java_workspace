package ch01;
import javax.swing.JFrame;




public class MyFrame extends JFrame{

	public MyFrame() {
		setTitle("MyFrame ����");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	// ���� �Լ� 
	public static void main(String[] args) {
		new MyFrame(); 
	} // end of main 



}
