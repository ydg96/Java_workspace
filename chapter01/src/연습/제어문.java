package ����;

import java.util.Scanner;

public class ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��� if
		//�־��� ���ǿ� ���� ������ �̷�� ������ ����
		//����...�̶��
		
		boolean flag = true;
		 //1.if�� �ܵ�
		if (flag) {
			System.out.println("���ǽ��� true �̸� ����˴ϴ�.");//���๮
		}
		
		//if else��
	    flag = false;
	    
		if(flag) {
			System.out.println("true ����");
		}else {
			System.out.println("false ����");
		}
		
		//3.if else if else ��
		System.out.println("������ �Է��ϼ���.");
		Scanner sc=new Scanner(System.in);
		int point =sc.nextInt();
		
		
		//int point =30;
		
		if(point >= 90) {
			System.out.println("A���� �Դϴ�.");
		}else if(point >= 80) {
			System.out.println("B���� �Դϴ�.");
		}else if(point >= 70) {
			System.out.println("C���� �Դϴ�.");
		}else if(point >= 60 ){
			System.out.println("D���� �Դϴ�.");
		}else {
			System.out.println("F���� �Դϴ�.");
		}
		
		
		
	}

}
