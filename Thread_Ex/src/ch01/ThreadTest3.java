package ch01;


class MyThread3 extends Thread{
	public void run() {
		for(int i=0; i< 20; i++) {
			System.out.println(i + ":" + Thread.currentThread());
		}
	}
}
public class ThreadTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread());
		MyThread3 thread1 =new MyThread3();
		MyThread3 thread2 =new MyThread3();
		MyThread3 thread3 =new MyThread3();
		
		//������ start()ȣ��
	
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
