package ch03;

public class MainTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//논리 연산자 (&&, ||) 엠퍼센트, 버티컬 바
		//관계 연산자와 혼합해서 많이 사용 됨.
		//연산에 결과가 true,false
		
		int num1=10;
		int num2=20;
		
		//1.논리 곱
		            //   true      //  true
		boolean flag1 = (num1 > 0)&&(num2 > 0);
		System.out.println(flag1);
		//               t              f
		boolean flag2=(num1 > 0)&& (num2 < 0);
		System.out.println(flag2);
		
		//2.논리 합
		boolean flag3=(num1 > 0)|| (num2 > 0);
		System.out.println(flag3);
		//                  f                t 
		boolean flag4 = (num1 < 0 )|| (num2 > 0);
		System.out.println(flag4);
		//둘 중 하나라도 true 이면 , 연산에 결과는 true
		
		

	}//end of main

}//end of class 
