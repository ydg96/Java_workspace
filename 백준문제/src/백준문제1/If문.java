package 백준문제1;

import java.util.Scanner;

public class If문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int A =sc.nextInt();
		int B =sc.nextInt();
		
		if(A>B) {
			System.out.println("<");
		}else if(A<B) {
			System.out.println(">");
		}else {
			System.out.println("==");
		}
	}

}
