package ����;

import java.util.Scanner;

public class ����10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//���� ������
		//���ǽ��� ����� true(��)�� ���� false(����)�� ��쿡 ���� �ٸ� ����� �����
		//if(���ǹ�)�� ������ ǥ���� �� ��� �� �� ����
		int max;
		System.out.println("�Է� ���� �� ���� ū���� ����ϼ���\n");
		//���ǽ�? ���1 : ��� 2;
		//���ǽ��� ���̸� ���1,���ǽ��� �����̸� ���2�� ���õ˴ϴ�.
		//int num = (5 > 3) ? 10 : 20;
		Scanner sc=new Scanner(System.in);
		System.out.println("�Է�1");
		int x =sc.nextInt();
		System.out.println("�Է�2");
		int y =sc.nextInt();
		max =(x > y)? x : y;
		//����,���� ���� ����Ϸ��� (x < y) ? x : y;
		System.out.println(max);
		//������ �켱����
		//���� ���� ���� �����ڴ� ()[]
		//���� ���� ���� ������ =
		
	}

}
