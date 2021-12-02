package 로또번호;

import java.util.Arrays;
import java.util.Random;

public class Lotto1 {
public static void main(String[] args) {
		
		Random rd = new Random();
		
		
		int lotto[] = new int[6];
		
		
		for(int i =0; i<6; i++) { //6개의 랜덤 번호 생성
			lotto[i] = rd.nextInt(45-1+1)+1;
			
			for(int j=0; j<i;j++) { //중복된 번호 제거
				if(lotto[i]== lotto[j]) {
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
		String comma ="";
		System.out.println("로또 당첨번호:");
		for (int i = 0; i < 6; i++) {
			if(i<5)comma =" 34"
					+ "";
			System.out.print(lotto[i]+comma);
			
		}
			
		
	
			
		}
	}


