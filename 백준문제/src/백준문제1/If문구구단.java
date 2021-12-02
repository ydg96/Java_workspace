package 백준문제1;

import java.util.Scanner;

public class If문구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int N =sc.nextInt();
		
		for(int i =1; i <= 9; i++) {
			System.out.println(N + "*" + i + "=" + (N*i));
		}
	}

}
