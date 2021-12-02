package 특강연습;

public class 논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//논리 연산자(&& , ||)
		//관계 연산자와 혼합하여 많이 사용됨
		//연산에 결과가 true , false
        int num1 =10;
        int num2 =20;
        
        //논리곱(&&)
        //두개중에 하나라도 false이면 false반환
        boolean flag1=(num1>0) && (num2 > 0);
        System.out.println(flag1);
        
        //논리합 (||)
        //두개중에 하나라도 true이면 true반환
        boolean flag2=(num1<0)||(num2 <0);
        System.out.println(flag2);
        
	}//end of main

}//end of class
