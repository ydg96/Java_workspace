package ch04;

import java.util.Scanner;

public class IfMainTest2 {

	public static void main(String[] args) {
		
	
		System.out.println("������ �Է��ϼ���:");
		Scanner sc= new Scanner(System.in);
		int point=sc.nextInt();
		char result ='X';
		
		//1.100������ �۰� 90������ ũ�ų� ������ result ='A'
		
		//2.90������ �۰� 80���� ũ�ų� ������ result ='B'
		
		//80~70
		
		//70~60
		
		//60~0
		
		//���� ���ǿ� �ƹ��͵� �ش����� �ʴ´ٸ�
		//ȭ�鿡 �߸��� �Է��� �ֽ��ϴ�.
		
		//������ result ���� X�� �ƴ϶�� 
		//��ſ� ������ A~f�Դϴ�.
		
		if (100 >= point  &&  90 <= point){
			result='A';
		}else if (90 >= point  &&  80 <= point){
			result='B';
		}else if (80 >= point  &&  70 <= point){
			result='C';
		}else if (70 >= point  &&  60 <= point){
			result='D';
		}else if (60 >= point  &&  0 <= point){
			result='F';
		}else {
			System.out.println("�߸��� �Է��� �ֽ��ϴ�");
		}
		if(result !='X') {
			System.out.println("��ſ� ������ " +result +"�Դϴ�");
		}
		
		 
		
		
		
		}

	{
		System.out.println("");

	}// end of main

}// end of calss
