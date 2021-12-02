package º¹½À;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int n =sc.nextInt();
		sc.close();
		
		for(int i=1; i <=9; i++) {
			System.out.println(n + "*" + i + "=" + (n*i));
		}
		}
	}


