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
		
		//�ζǹ迭�� 6���� �������� ����
		for(int i=0; i<6; i++) {
		lottoAr[i]=random.nextInt(45+1);
		}
		bonus=random.nextInt(45+1);
		System.out.println("Lotto:"+Arrays.toString(lottoAr)+",bonus:"+bonus);
		//����ڿ��� 6���� ���� ���ʽ��� �Է�
		System.out.println("�ζǼ��� 6���Է�:");
		for(int i=0; i<6; i++) {
			userAr[i]=sc.nextInt();
		}
		System.out.println("���ʽ� �� �Է�:");
		bonusUser=sc.nextInt();
		
		//�ζǹ迭�� ���� ����ڹ迭�� ���� ���� ���� � �ִ��� ī����
		for(int j=0;j<6;j++) {
			for(int i=0;i<6;i++) {
				if(lottoAr[j]==userAr[i]) {
					count++;
				}
			}
		}
		//count �� ������ ���� ������ϱ�
		if(count==6) {
			System.out.println("���ϵ帳�ϴ�! 1���Դϴ�.");
		}
		else if(count==5) {
			if(bonus==bonusUser) {
				System.out.println("���ϵ帳�ϴ�! 2���Դϴ�.");
			}
			else {
				System.out.println("���ϵ帳�ϴ�! 3���Դϴ�.");
			}
		}
		else if(count==4) {
			System.out.println("���ϵ帳�ϴ�! 4���Դϴ�.");
		}
		else if(count==3) {
			System.out.println("���ϵ帳�ϴ�! 5���Դϴ�.");
		}
		else {
			System.out.println("�̹����� ���� �帨�� ���׿�.");
		}
	
		
		
		
		
		
	}
}
