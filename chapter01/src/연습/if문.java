package 연습;

import java.util.Scanner;

public class if문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("성적을 입력하세요.");
		Scanner sc =new Scanner(System.in);
		int point =sc.nextInt();
		char result = 'Z';
		
		if(point <= 100&& point >= 90) {
			//수행문
	       result ='A';
		}else if(point <=90  && point >= 80) {
	       result = 'B';
		}else if(point <= 80 && point >= 70) {
			result = 'C';
		}else if(point <= 70 && point >= 60) {
			result = 'D';
		}else if(point <= 60 && point >= 0) {
			result ='F';
		}else {
			System.out.println("잘못된 입력 입니다.");
		}
		if(result != 'Z') {
			System.out.println("당신에 학점은 :" + result + "입니다.");
		}
		

	}

}
