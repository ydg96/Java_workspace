package ch04;

import java.util.Scanner;

public class IfMainTest {

	
	//메인함수(코드의 시작점)
	public static void main(String[] args) {
		
		//제어문 if
		//주어진 조건에 따라서 실행이 이루어 지도록 구현
		boolean flag=true;
		
	    //flag=false;
		//if단독
		if(flag) {
			System.out.println("조건식이 true이면 실행 됩니다");
			}//end of if
		
		//if else 문
		if(flag) {
			System.out.println("true 실행");
		}else {
			System.out.println("false 실행");
		}
		
		//if else if else 문
		
		;//<--70값을 넣었음 --> Scanner
		System.out.println("성적을 입력하세요:");
		Scanner sc=new Scanner(System.in);
		int point=sc.nextInt();
		
		if(point >=90) {
			System.out.println("A학점 입니다");
		}else if (point>=80) {
			System.out.println("B학점 입니다");
		}else if (point >=70) {
			System.out.println("c학점 입니다");
		}else if (point>=60) {  
		    System.out.println("D 학점 입니다");
     	}else{
     		System.out.println("F학점 입니다");
        }
		
		
		
		
	
		
		
		

	}//end of main

}//end of class
