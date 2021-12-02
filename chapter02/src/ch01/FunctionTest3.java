package ch01;

public class FunctionTest3 {

	

	
	//문제1.리턴값 int, 매개변수 n1, n2, n3,이름은 int Add
	public static int add(int n1,int n2 ,int n3){
		int result;
		result = n1 + n2 + n3;
		return result;
	}
	//문제2.리턴값 double,매개변수 d1 ,d2 이름은 doubleAdd
	public static double doubleAdd(double d1,double d2) {
		double result;
		result =d1 + d2;
		return result;
	}
	
	//문제3.리턴값 void,매개변수(String aeticle)이름은 printArticle
	public static void printArticle(String article){
		System.out.println("["+ article +"]");
	}
	
	
	}

