package ch02;

import java.util.Random;

public class Student{


public static void main(String[] args) {

	//��ü�� �Ӽ��� ��� ������,��ü�� ����� �޼���� �����Ѵ�.
	
		 System.out.println("�ζ� ���� �����ڸ� + ���ʽ�");
	     System.out.println(randomNuber());
	     System.out.println(randomNuber());
	     System.out.println(randomNuber());
	     System.out.println(randomNuber());
	     System.out.println(randomNuber());
	     System.out.println(randomNuber());
	     System.out.println("���ʽ�");
	     System.out.println(randomNuber());
	}//end of main
	
	//�Լ� �����
	
	public static int randomNuber() {
		int value;
		Random random = new Random();
		value = random.nextInt(45) + 1;//1 ~ 45���� ������ �ϳ��� ��ȯ
		return value;
		
	}
	
	
}