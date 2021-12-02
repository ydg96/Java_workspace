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
		System.out.println("작업자를 생성하겠습니다.");
		//메인 쓰레드가 작업자를 생성
		MtThread thread1 =new MtThread();
		//작업자 1이 작업을 시작(sun메서드 호출)
		thread1.start();
		
		//메인 쓰레드가 작업함
	/*System.out.println("중지 하려면 0번을 입력 하시오.");
		Scanner sc =new Scanner(System.in);
		int userInput =sc.nextInt();
		
		if(userInput==0) {
			
			//thread1.stop();//deprecated(더이상 사용하지 마시오)
			thread1.flag =false;
		}*/
		
		//문제 : do while 문 사용해서 무한루프를 종료해 주세여.
		//1.do while
		//2.do 문에서 로직을 만들어 주세요.
		
		int userInput;
		Scanner sc =new Scanner(System.in);
		do {
			System.out.println("중지 하려면 0번을 입력하시오");
			userInput = sc.nextInt();
			if(userInput ==0 ) {
				thread1.flag =false;
			}
			//입력 받기
			//플래그 변수 사용해서 flase
			
		}while(userInput !=0);//userInput이 0이 아니라면 무한 반복해주세요!

	}

}
