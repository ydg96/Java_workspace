package ch01;

public class MainTest1 {

	public static void main(String[] args) {

		//논리 연산자(&&,||)
		//관계 연산자와 혼합하여 많이 사용 됨
		//연산에 결과가 true,false
		
		int num1=10;
		int num2=20;
		
		//1.논리곱 (&&)
		boolean flag1=(num1>0)&&(num2>0); //둘다 참이면 참
		System.out.println(flag1);
		
		boolean flag2=(num1>0)&&(num2 <0);//둘중 하나가 거짓이면 거짓
		System.out.println(flag2);
		
		//2.논리합(||)
		boolean flag3=(num1 >0)||(num2 >0);//둘다 참이먄 참
		System.out.println(flag3);
		
		boolean flag4=(num1<0)||(num2 >0);//둘중 하나가 참이라면 참
		System.out.println(flag4);
		
		
		
	}

}
