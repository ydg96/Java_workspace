package ch01;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input;
		int sum = 0;
		System.out.println("������ ������ �Է��ϼ���:");
		do {
			input = sc.nextInt();
			sum += input;
		} while (input != 0);
	
		System.out.println("������� :"+sum);
	
	

	}

}
