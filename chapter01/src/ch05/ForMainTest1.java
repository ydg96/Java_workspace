package ch05;

public class ForMainTest1 {

	public static void main(String[] args) {
	
		
		/*
		 * for(초기화식;조건식;증감식){
		 * 수행문
		 * }
		 */
	
		
		//for문을 이용해서 1부터 10까지 덧셈연산
		//연산에 결과를 담을 변수가 필요함.
		int sum=0;
		for(int I =1;I <= 10; I++) {
			System.out.println("현재 I 값은:"+I);
			sum = sum +I;
		}
		System.out.println("================");
	     System.out.println("최종 결과값:"+sum);
	
	
	}//end of main

}//end od class
