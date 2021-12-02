package 연습;

public class 논리연사자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//논리 연산자 (&& , ||) 엠퍼센트,버티컬 바
		//관계 연사자와 혼합하여 많이 사용함
		//연산에 결과가 true,false
		
		int num1 =10;
		int num2 =20;
		
		boolean flag =(num1 > 0)&&(num2 > 0);
		//논리곱(&&)에서는 두개중에 하나라도 거짓이면 거짓.
		System.out.println(flag);
		boolean flag1 =(num1 < 0)||(num2 > 0);
		//논리 합(||)에서는 둘중 하나가 참이면 참.두개다 거짓이면 거짓.
		System.out.println(flag1);
	}

}
