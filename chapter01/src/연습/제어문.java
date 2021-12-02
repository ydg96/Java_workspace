package 연습;

import java.util.Scanner;

public class 제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//제어문 if
		//주언진 조건에 따라서 실행이 이루어 지도록 구현
		//만약...이라면
		
		boolean flag = true;
		 //1.if문 단독
		if (flag) {
			System.out.println("조건식이 true 이면 실행됩니다.");//수행문
		}
		
		//if else문
	    flag = false;
	    
		if(flag) {
			System.out.println("true 실행");
		}else {
			System.out.println("false 실행");
		}
		
		//3.if else if else 문
		System.out.println("성적을 입력하세요.");
		Scanner sc=new Scanner(System.in);
		int point =sc.nextInt();
		
		
		//int point =30;
		
		if(point >= 90) {
			System.out.println("A학점 입니다.");
		}else if(point >= 80) {
			System.out.println("B학점 입니다.");
		}else if(point >= 70) {
			System.out.println("C학점 입니다.");
		}else if(point >= 60 ){
			System.out.println("D학점 입니다.");
		}else {
			System.out.println("F학점 입니다.");
		}
		
		
		
	}

}
