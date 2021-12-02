package ch01;

public class FunctionMainTest2 {

	public static void main(String[] args) {

		int num1=10;
		int num2=20;
		
		int total=addNum(num1,num2);
		sayHello("반갑습니다 안녕하세요");
		int sum=calcSum();
		
		System.out.println(total);
		System.out.println(sum);
		
		int n1=20;
		int n2=10;
		int n3=30;
		
		double d1=1.8;
		double d2=2.2;
		
		int to=intAdd(n1,n2,n3);
		int to1=(int)doubleAdd(d1,d2);
		printArticle("윤동근");
		
		System.out.println(to);
		System.out.println(to1);
		
	}// end of main

	// addNum
	public static int addNum(int n1, int n2) {
		// 함수 안에서 사용되는 변수를 지역 변수라고 합니다.
		int result;
		result = n1 + n2;
		return result;
	}// end of addNum

	// 리턴값이 없는 함수 void
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}

	// 매견 변수가 없는 함수
	public static int calcSum() {
		int sum = 0;
		int i;
		for (i = 0; i < 100; i++) {
			sum += i;
		}
		return sum;
	}//end of calc
	
	//함수를 만들어 봅시다.
	//1.리턴값은 int 매개변수 n1,n2,n3(int)이름은 intAdd
	public static int intAdd(int n1,int n2,int n3) {
		int result;
		result =n1+n2+n3;
		return result;
	}
	//2.리턴값은 double 매개변수는 d1,d2(double) 이름은 doubleAdd
	public static double doubleAdd(double d1,double d2) {
		int result; 
		result=(int)(d1+d2);
		return result;
	}
	//2.리턴값이 void 매겨변수 String article 이름은 printArticle
	
	public static void printArticle(String article) {
		System.out.println(article);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
