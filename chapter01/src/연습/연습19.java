package 연습;

public class 연습19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//대입 연산자 (=0
		
		int number = 10;
		
		int number2 = number;
		//변수에 변수를 대입할 수도 있습니다.
		
	   System.out.println(number);
	   System.out.println(number2);
	   
	   //부호 연산자 (+ , -)
	   //부호를 변경하는 연산자 입니다.
	   //단 변수에 들어있는 실제 값을 변경한 상태는 아닙니다.
	   
	   System.out.println(-number);
	   //실제 값이 변경 되었나?
	   System.out.println("number 값 확인 " + number);
	   
	   
	   
	   //변수에 실제 값을 변경하려면 대입 연산자를 사용해야한다.
	   number = -number;
	   System.out.println(number);
	   
	   
	   
		
		
	}

}
