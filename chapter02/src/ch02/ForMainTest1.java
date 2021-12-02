package ch02;

public class ForMainTest1 {

	// 메인함수(코드의 시작점)
	public static void main(String[] args) {

		// 이중 for문 연습
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("가");
		System.out.println("나");
		System.out.println("-------------");

		for (int i = 6; i <= 1; i++) {

			for (int j = 0; j > i; j++) {
				System.out.print("*");

			} // end of for - j
			System.out.println();

		} // end of for - i

	}// end of main

}// end of class
