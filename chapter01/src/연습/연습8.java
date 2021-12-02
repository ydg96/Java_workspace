package 연습;

public class 연습8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1=10;
		int num2=20;
		//(&& 논리곱) 두항이 모두 참이면 결과 값 참
		boolean flag = (num1 >= 9) && (num2 >= 1);
		System.out.println(flag);
		//||(논리합)두 항중에 하나의 항만 참이면 결과 값 참
		//두항이 모두 거짓이면 결과 값은 거짓
		flag =(num1 < 9)||(num2 > 1);
		System.out.println(flag);
		//(!부정)단항 연산자 참인 경우 거짓으로 바꾸고,거짓인 경우 참
	    flag =!(num1 < 0);
	    System.out.println(flag);
		
	}

}
