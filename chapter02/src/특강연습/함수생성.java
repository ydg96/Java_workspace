package 특강연습;

public class 함수생성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int addResult1 =add(77, 33);
		System.out.println(addResult1);
		int addResult2 =add(10,30);
		System.out.println(addResult2);
	}
		//add함수 생성
		public static int add(int num1,int num2){
			int result;
			result = num1 + num2;
			return result;
		

	}

}
