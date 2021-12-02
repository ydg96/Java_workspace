package 로또번호;

import java.util.Arrays;
import java.util.Random;

public class lotto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r =new Random();
		
		int lotto[]= new int[6];
		int check[]= new int[45];
		
		System.out.println("===============");
		for (int i = 'A'; i <= 'E'; i++) {
			System.out.print((char)i + "자동");
			for (int i1 = 0; i1 < lotto.length; i1++) {
				lotto[i1]=r.nextInt(45) + 1;
				if(check[lotto[i1]]==0) {
					check[lotto[i1]]=1;
				
				}
				else
					i1--;
			}
			Arrays.sort(lotto);
			System.out.println(lotto[i]);
			System.out.println();
		}
		
	}

}










