package ch03;

import java.util.Scanner;

class MtThread extends Thread{
	boolean flag = true;
	@Override
	public void run() {
		while(flag) {
			
			System.out.print("-");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class TerminateThread {

	public static void main(String[] args) {
		System.out.println("�۾��ڸ� �����ϰڽ��ϴ�.");
		//���� �����尡 �۾��ڸ� ����
		MtThread thread1 =new MtThread();
		//�۾��� 1�� �۾��� ����(sun�޼��� ȣ��)
		thread1.start();
		
		//���� �����尡 �۾���
	/*System.out.println("���� �Ϸ��� 0���� �Է� �Ͻÿ�.");
		Scanner sc =new Scanner(System.in);
		int userInput =sc.nextInt();
		
		if(userInput==0) {
			
			//thread1.stop();//deprecated(���̻� ������� ���ÿ�)
			thread1.flag =false;
		}*/
		
		//���� : do while �� ����ؼ� ���ѷ����� ������ �ּ���.
		//1.do while
		//2.do ������ ������ ����� �ּ���.
		
		int userInput;
		Scanner sc =new Scanner(System.in);
		do {
			System.out.println("���� �Ϸ��� 0���� �Է��Ͻÿ�");
			userInput = sc.nextInt();
			if(userInput ==0 ) {
				thread1.flag =false;
			}
			//�Է� �ޱ�
			//�÷��� ���� ����ؼ� flase
			
		}while(userInput !=0);//userInput�� 0�� �ƴ϶�� ���� �ݺ����ּ���!

	}

}
