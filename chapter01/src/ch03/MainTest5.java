package ch03;

public class MainTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�� ������ (&&, ||) ���ۼ�Ʈ, ��Ƽ�� ��
		//���� �����ڿ� ȥ���ؼ� ���� ��� ��.
		//���꿡 ����� true,false
		
		int num1=10;
		int num2=20;
		
		//1.�� ��
		            //   true      //  true
		boolean flag1 = (num1 > 0)&&(num2 > 0);
		System.out.println(flag1);
		//               t              f
		boolean flag2=(num1 > 0)&& (num2 < 0);
		System.out.println(flag2);
		
		//2.�� ��
		boolean flag3=(num1 > 0)|| (num2 > 0);
		System.out.println(flag3);
		//                  f                t 
		boolean flag4 = (num1 < 0 )|| (num2 > 0);
		System.out.println(flag4);
		//�� �� �ϳ��� true �̸� , ���꿡 ����� true
		
		

	}//end of main

}//end of class 
