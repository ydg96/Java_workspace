package Ư������;

import java.util.Scanner;

public class ��ĳ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
	    int input;
	    int sum = 0;
	    System.out.println("������ ������ �Է��ϼ���.");
	    
	    do {	
	    input = sc.nextInt();
	    	sum += input;	    	
	    }while(input != 0);
	    System.out.println("������� " + sum);
	    
	}

}
