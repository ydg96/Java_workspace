package 특강연습;

public class 연산자문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  i= 10;
		double d = 20.5;
		
		
		double result1 = i+d;
		
		System.out.println(result1);
		System.out.println((int)result1);
		System.out.println(i - 1);
		System.out.println(-d);
		
		boolean result2 =(i < d);
		System.out.println(result2);
		
		int num1 =10;
		int num2 = 30;
		boolean result3=(num1 > 50)&&(num2 > 50);
		System.out.println(result3);
		
		int max;
		max = (num1 > num2)?10 : 30;
		System.out.println(max);
		
		//논리형 boolean
		//문자형 char
	    //정수형 byte , short , int , long
		//실수형 float , double 
		
		long regNO = 9607021865828L;
		
		System.out.println("1"+"2");
		System.out.println(true + "");
		System.out.println('A'+'B');
		System.out.println('1'+ 2);
		System.out.println('1'+ '2');
		System.out.println("J"+"ava" );
		
		
		
	}

}
