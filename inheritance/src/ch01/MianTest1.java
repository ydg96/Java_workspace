package ch01;

class A{
	
	int number1;
	int number2;
	int number3;
}

class B{
	int number1;
	int number2;
	int number3;
	int number4;
	int number5;
}       //extends 상속(간단하게 사용가능)
class C extends A{
	int number4;
	int number5;
	
}
	


//퍼블릭 클래스는 하나에 파일안에서는 하나의 클래스만 가능
public class MianTest1 {

	public static void main(String[] args) {
	

		C c1 = new C();
		c1.number1 =1;
		c1.number2 =2;
		c1.number3 =3;
		c1.number4 =4;
		c1.number5 =5;
		System.out.println(c1.number1);
		System.out.println(c1.number2);
	    System.out.println(c1.number5);
	}

}
