package ch03;

import java.util.Scanner;

public class MainTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//삼항 연산자
		//조건식 ? 결과1 : 결과2
		
		int num1 =(5>3)?10:20;
		System.out.println(num1);
		
		int num2 = (5<3)?10:20;
		System.out.println(num2);
		
		//JDK 만들어준 도구를 이용해 봅시다.
		int max;
		System.out.println("!!");
		
		Scanner sc= new Scanner(System.in);
		System.out.println("입력1:");
		int x=sc.nextInt();
		System.out.println("입력2:");
		int y=sc.nextInt();
		
		max=(x > y)? x : y;
		System.out.println("더 바보는 :"+ max+ "나말고 니네 입니다");
		
		
		
		
		
		
	}//end of main
	
}//end of class
