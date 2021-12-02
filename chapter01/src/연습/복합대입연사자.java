package 연습;

public class 복합대입연사자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//복합 대입 연산자
		//대입 연사자와 다른 연산자가 함께 쓰임
		
		int num1 =1;
		num1 = num1 + 10;
		System.out.println(num1);
		//num1 += 10;
		num1 = 1;
		//조금 더 간편하게 사용할 수 있다.
		num1 += 10;
		System.out.println(num1);
		
	    int num2 =1;
//		num2 = num2 -10;
//		System.out.println(num2);
		
		num2 = 1;
		num2 -=10;
		System.out.println(num2);
		
	 
		
		
		
	}//end of main

}//end of class
