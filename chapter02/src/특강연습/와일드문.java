package Ư������;

import java.util.Scanner;

public class ���ϵ幮 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int num =1;
		//int sum =0;
		//while(num <= 10) {
		//	sum+=num;
		//	num++;
		//}
		//System.out.println("�հ�" + sum);
		//System.out.println("num:" + num);
		
	

	Scanner scanner = new Scanner(System.in);
	int input;
	int sum = 0;
	do {
		input = scanner.nextInt();
		sum += input;
	}while (input != 0);
	 System.out.println(sum);
	}

}
