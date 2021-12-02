package ch05;

public class ContinueTest {

	public static void main(String[] args) {

		// 예약어 continue
		// 무시하고 진행하는 continue

		int num;
		int count = 0;
		// 상수 2개 만들어 봅시다.
        final int MAX =1000;
        final int MULTIPLE=7;
		for (num = 1; num <= MAX; num++) {

			// 3에 배수이면 출력 하지 마시오.
			if (num % MULTIPLE == 0) {
				count++;
				continue;

			}
			//System.out.println("출력값:" + num);

		} // enf oof for

		System.out.println(MULTIPLE +"의 배수 개수는:" + count);

	}// end of main

}// end of class
