package ch01;

public class StudentMainTest1 {

	//main 함수(코드의 시작점)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=10;
		int num2=20;
		
		Student s1;//Sutdent 참조 타입 s1란 변수를 선언
		Student s2;//Sutdent 참조 타입 s2란 변수를 선언
		
		s1 =new Student();//s1란 변수를 초기화(객체화 했다)
		s2 =new Student();//s2란 변수를 초기화(객체화 했다)
		
		System.out.println(num1);
		System.out.println(s1);
		System.out.println(s2);
		
		
	}//end of main

}//end of class
