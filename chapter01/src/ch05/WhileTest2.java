package ch05;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input;
		int sum = 0;

		System.out.println("������ ������ �Է��ϼ���:");

		// input ���� 0�ƴϸ� ��� �Է°��� ���� �� �ֵ��� ó���� ���ô�.
		do {

			input = sc.nextInt();
			sum = sum + input;
		} while (sum != 0);
		System.out.println("�������:" + sum);

	}
}
