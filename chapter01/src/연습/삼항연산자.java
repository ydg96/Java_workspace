package ����;

import java.util.Scanner;

public class ���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���� ������
		//���ǽ�??���1 : ���2;
		
//		int num1 = (5 > 3)?10 : 20;
		//    (���)������ ���̸� �տ�,�����̸� ��
//		System.out.println(num1);
		
//		int num2 = (5 < 3)? 10 : 20;
//		System.out.println(num2);
		
		//JDK ������� ������ �̿��� ���ô�.
		int max;
		System.out.println("�Է� ���� �� ���� ū ���� ����ϼ���");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("�Է�1 :");
		int X =sc.nextInt();
		System.out.println("�Է�2 :");
		int y =sc.nextInt();
		
		max =( X > y)? X : y;
		System.out.println("ū ���ڴ� :" + max + "�Դϴ�.");
	}

}
