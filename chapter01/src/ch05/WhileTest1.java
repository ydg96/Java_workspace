package ch05;

public class WhileTest1 {

	public static void main(String[] args) throws InterruptedException{
		
		int num=1;
		
		while(num < 100 ){
		System.out.println("���� ��:" + num);
		num++;
		}
		Thread.sleep(200);
		

	}//end of main

}//end of class
