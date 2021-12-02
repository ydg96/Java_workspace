package ch04;

import java.util.Scanner;

public class IfMainTest2 {

	public static void main(String[] args) {
		
	
		System.out.println("성적을 입력하세요:");
		Scanner sc= new Scanner(System.in);
		int point=sc.nextInt();
		char result ='X';
		
		//1.100점보다 작고 90점보다 크거나 같으면 result ='A'
		
		//2.90점보다 작고 80보다 크거나 같으면 result ='B'
		
		//80~70
		
		//70~60
		
		//60~0
		
		//위에 조건에 아무것도 해당하지 않는다면
		//화면에 잘못된 입력이 있습니다.
		
		//마지막 result 값이 X가 아니라면 
		//당신에 학점은 A~f입니다.
		
		if (100 >= point  &&  90 <= point){
			result='A';
		}else if (90 >= point  &&  80 <= point){
			result='B';
		}else if (80 >= point  &&  70 <= point){
			result='C';
		}else if (70 >= point  &&  60 <= point){
			result='D';
		}else if (60 >= point  &&  0 <= point){
			result='F';
		}else {
			System.out.println("잘못된 입력이 있습니다");
		}
		if(result !='X') {
			System.out.println("당신에 학점은 " +result +"입니다");
		}
		
		 
		
		
		
		}

	{
		System.out.println("");

	}// end of main

}// end of calss
