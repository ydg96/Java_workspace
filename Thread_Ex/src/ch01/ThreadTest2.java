package ch01;

//������� �۾��� �̴�.
class MyThreadEx2 extends Thread {
	String name;

	public MyThreadEx2() {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void run() {
		int i;

		for (i = 0; i < 50; i++) {
			System.out.println(name + ":" + i + "\t");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class ThreadTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread());//
		System.out.println("���� ������ ����");
		MyThreadEx2 th1 =new MyThreadEx2();
		
		

	}

}
