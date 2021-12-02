package 특강연습;

import java.util.Scanner;

public class 스캐너 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
	    int input;
	    int sum = 0;
	    System.out.println("덧셈값 정수를 입력하세요.");
	    
	    do {	
	    input = sc.nextInt();
	    	sum += input;	    	
	    }while(input != 0);
	    System.out.println("결과값은 " + sum);
	    
	}

}
