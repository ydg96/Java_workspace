package ch03;

public class MainTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ���� ������
		//���� �����ڿ� �ٸ������ڰ� �Բ� ���
		
		int num1=1;
		num1 = num1 +10;
		num1 += 10;
		
		System.out.println("===================");
		
		int num2 =1;
		//����-->���մ��� �����ڷ� ������ �ּ���.
		//num2 = num2- 10;
		num2-=10;
		
		System.out.println("====================");
		num1 *=2;
		System.out.println(num1);
		System.out.println("====================");
        num2/=2;
        System.out.println(num2);
        System.out.println("====================");
        num2 %=2;
        System.out.println(num2);
        
	}//end of main

}//end of class
