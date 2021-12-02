package 로또번호;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r =new Random();
		
		int lotto[]=new int[6];
		int check[]=new int[46];
		
		System.out.println("=====================");
		for(int k='A';k <='E'; k++) {
			System.out.println((char)k + "수동");
			for(int i=0; i <lotto.length; i++) {
				lotto[i]=r.nextInt(45)+1;
				
				if(check[lotto[i]]==0) {
					check[lotto[i]]=1;
				}
				else
					i--;
				
			}
			
			Arrays.sort(lotto);
			
		
			for(int i =0; i< 6; i++) {
				System.out.print(lotto[i] + " , ");
			
				
				
			}
		
				System.out.println();
			}
			
		}
		

	}


