package ch03;

public class MainTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����,���� ������
		// ++ , --

		int num1 = 1;

		// num1= num1 + 1;
		num1++;
		System.out.println(num1);

		int num2 = 1;
		num2--;
		// num2 =num2 - 1;
		System.out.println(num2);
		System.out.println("==========================");

		// ȥ�� ����!!!
		// 1.���� �����ڰ� �ڿ� �� ���
		int num3 = 10;
		int num4;

		num4 = num3++;
		System.out.println(num4);
        //num3(10)num4�� ���� ���� �����ϰ� �� �� num3���� 1����
		System.out.println("num3�� ���簪 :"+num3);
		System.out.println("num4�� ���簪 :"+num4);
		
		//2.���� �����ڰ� �տ� �� ���
		int num5=10;
		int num6=++num5;
		
		System.out.println("num5�� ���簪:"+num5);
		System.out.println("num6�� ���簪:"+num6);
		
		//���:���� �����ڴ� ����(����)�� �ִ� ���� 1���� ��ų ���̴�.
		//��, �տ� ���� ���� �ڿ� ���� �� ���꿡 ������ �ٸ���.
		
		
		
	}// end of main

}// end of calss
