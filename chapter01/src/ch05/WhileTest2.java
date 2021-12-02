package ch05;

import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input;
		int sum = 0;

		System.out.println("덧셈값 정수를 입력하세요:");

		// input 값이 0아니면 계속 입력값을 받을 수 있도록 처리해 봅시다.
		do {

			input = sc.nextInt();
			sum = sum + input;
		} while (sum != 0);
		System.out.println("결과값은:" + sum);

	}
}
