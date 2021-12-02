package 연습;

import java.util.Scanner;

public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//삼항 연산자
		//조건식??결과1 : 결과2;
		
//		int num1 = (5 > 3)?10 : 20;
		//    (결과)에따라서 참이면 앞에,거짓이면 뒤
//		System.out.println(num1);
		
//		int num2 = (5 < 3)? 10 : 20;
//		System.out.println(num2);
		
		//JDK 만들어준 도구를 이용해 봅시다.
		int max;
		System.out.println("입력 받은 두 수중 큰 수를 출력하세요");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("입력1 :");
		int X =sc.nextInt();
		System.out.println("입력2 :");
		int y =sc.nextInt();
		
		max =( X > y)? X : y;
		System.out.println("큰 숫자는 :" + max + "입니다.");
	}

}
