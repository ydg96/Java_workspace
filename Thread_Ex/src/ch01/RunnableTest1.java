package ch01;

import javax.swing.JFrame;
 //Runnable �������̽��� �����Ͽ� ������ �����
class MyRunnable1 extends JFrame implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i <200; i++) {
			System.out.print(i + "\t");
		}
	}
	
	
}

public class RunnableTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyRunnable1 myRunnable1 = new MyRunnable1();
		//������ ��� ���
		//Runnable ������ ��ü�� Thread�� �����ؼ� �Ű������� ��� �����带 �����Ѵ�(Start)
		Thread thread1 =new Thread(myRunnable1);
		Thread thread2 =new Thread(myRunnable1);
		
		thread1.start();
		thread2.start();
		
	}

}
