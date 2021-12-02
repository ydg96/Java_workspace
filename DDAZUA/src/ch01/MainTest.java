package ch01;

import java.util.*;

public class MainTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int lottoAr[]=new int[6];
		int userAr[]=new int[6];
		int bonus,bonusUser;
		int count=0;
		
		//로또배열에 6개의 랜덤값을 저장
		for(int i=0; i<6; i++) {
		lottoAr[i]=random.nextInt(45+1);
		}
		bonus=random.nextInt(45+1);
		System.out.println("Lotto:"+Arrays.toString(lottoAr)+",bonus:"+bonus);
		//사용자에게 6개의 값과 보너스를 입력
		System.out.println("로또숫자 6개입력:");
		for(int i=0; i<6; i++) {
			userAr[i]=sc.nextInt();
		}
		System.out.println("보너스 값 입력:");
		bonusUser=sc.nextInt();
		
		//로또배열의 값과 사용자배열의 값중 같은 값이 몇개 있는지 카운팅
		for(int j=0;j<6;j++) {
			for(int i=0;i<6;i++) {
				if(lottoAr[j]==userAr[i]) {
					count++;
				}
			}
		}
		//count 의 갯수에 따라서 등수정하기
		if(count==6) {
			System.out.println("축하드립니다! 1등입니다.");
		}
		else if(count==5) {
			if(bonus==bonusUser) {
				System.out.println("축하드립니다! 2등입니다.");
			}
			else {
				System.out.println("축하드립니다! 3등입니다.");
			}
		}
		else if(count==4) {
			System.out.println("축하드립니다! 4등입니다.");
		}
		else if(count==3) {
			System.out.println("축하드립니다! 5등입니다.");
		}
		else {
			System.out.println("이번생에 운은 드릅게 없네요.");
		}
	
		
		
		
		
		
	}
}
