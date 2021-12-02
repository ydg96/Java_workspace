package ch01;

import java.util.Scanner;

public class ch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1차원배열 x2 2차원배열
		//int ar1[]=new int[5];
		//int ar2[]=new int[5];
		
		//자료형 배열명[][]=new int[묶음크기][변수갯수]
		//int ar3[][]=new int [2][5];
				
		Scanner sc=new Scanner(System.in);
		int scores[][]=new int [4][3];
		String subject[]= {"국어,영어,수학"};
		for(int j=0; j<4; j++) {
			System.out.println((j+1)+"번 학생 점수----");
			for(int i=0; i<3; i++) {
				System.out.print(subject[i]+":");
				scores[j][i]=sc.nextInt();			
			}
		}
		//2차원배열에 저장된 값을 출력
		for(int i=0; i<3; i++) {
			System.out.println("\t"+subject[i]);
		}
		for(int j=0; j<4; j++) {
		System.out.println(j+1+"1번:\t");
		for(int i=0; i<3; i++) {
			System.out.println(scores[j][i]+"\t");
		}
		}
		
		
	}

}
