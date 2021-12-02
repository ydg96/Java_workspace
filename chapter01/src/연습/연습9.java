package 연습;

public class 연습9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 = 5;
		int i = 0;
		//논리곱은 두항의 결과가 모두 true일떄만 결과가 true
		//--앞의 항의 결과가 flase이면 뒤 항의 결과를 평가하지 않음
		boolean value =((num1= num1 + 10)> 10)&&((i = i + 2) < 10);
		 //5 = 5 + 10 < 10 (*) 0 = 0 +2 < 10
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		       
		//논리합은 두항의 결과가 모두 false일 때만 결과가 false
		//--앞의 항의 결과가 true이면 뒤 항의 결과를 평가하지 않음
		value =((num1 = num1 +100 )> 10)||((i = i + 2 ) < 10);
		 //5 = 5 + 10 < 10 (+)(0 = 0 + 2 <10
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
