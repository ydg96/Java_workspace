package ch01;

import java.util.Scanner;

public class ch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1�����迭 x2 2�����迭
		//int ar1[]=new int[5];
		//int ar2[]=new int[5];
		
		//�ڷ��� �迭��[][]=new int[����ũ��][��������]
		//int ar3[][]=new int [2][5];
				
		Scanner sc=new Scanner(System.in);
		int scores[][]=new int [4][3];
		String subject[]= {"����,����,����"};
		for(int j=0; j<4; j++) {
			System.out.println((j+1)+"�� �л� ����----");
			for(int i=0; i<3; i++) {
				System.out.print(subject[i]+":");
				scores[j][i]=sc.nextInt();			
			}
		}
		//2�����迭�� ����� ���� ���
		for(int i=0; i<3; i++) {
			System.out.println("\t"+subject[i]);
		}
		for(int j=0; j<4; j++) {
		System.out.println(j+1+"1��:\t");
		for(int i=0; i<3; i++) {
			System.out.println(scores[j][i]+"\t");
		}
		}
		
		
	}

}
