package ch01;

import java.util.concurrent.RunnableFuture;

import javax.swing.JFrame;

class MyRunnable2 extends JFrame{
	
	int grade =10;
	
	//���� �͸� ��ü�� ������ ��Ƽ� ��� �ϴ¹��
	Runnable runnable =new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i <10; i++) {
				System.out.print("--");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				}
			}
		};

	

	public MyRunnable2() {
		//runable.run();
	}
}






public class RunnableTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyRunnable2 runnable2 =new MyRunnable2();
		//�ܺϿ��� ���۽��Ѻ���

		
		//runnable2.runable.run();
				
			
		
	}

}
