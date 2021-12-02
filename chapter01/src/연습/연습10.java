package 연습;

import java.util.Scanner;

public class 연습10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//조건 연산자
		//조건식의 결과가 true(참)인 경우와 false(거짓)인 경우에 따라 다른 결과가 수행됨
		//if(조건문)을 간단히 표현할 때 사용 할 수 있음
		int max;
		System.out.println("입력 받은 두 수중 큰수를 출력하세요\n");
		//조건식? 결과1 : 결과 2;
		//조건식이 참이면 결과1,조건식이 거짓이면 결과2가 선택됩니다.
		//int num = (5 > 3) ? 10 : 20;
		Scanner sc=new Scanner(System.in);
		System.out.println("입력1");
		int x =sc.nextInt();
		System.out.println("입력2");
		int y =sc.nextInt();
		max =(x > y)? x : y;
		//만약,작은 수를 출력하려면 (x < y) ? x : y;
		System.out.println(max);
		//연산자 우선순위
		//가장 높은 순위 연산자는 ()[]
		//가장 낮은 순위 연산자 =
		
	}

}
