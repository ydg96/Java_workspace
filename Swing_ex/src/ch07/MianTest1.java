package ch07;

import java.util.Arrays;
import java.util.Random;

public class MianTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]numbers =new int[6];
		Random random =new Random();
		
		//���� ��ȣ
		for (int i = 0; i < numbers.length; i++) {
			
		
		int selectedNumber =random.nextInt(45) +1;
		numbers[i] =selectedNumber;
		
		//i -> 0
		//i -> 1 (��ȣ�� �ΰ� ����� ����)(3,3)
		for(int j = 0; j<i; j++) {
			if(numbers[i] == numbers[j]) {
				
				i =i-1;
				break;
			}
		}
		
		
		
		}//end of for-1
		
		Arrays.sort(numbers);
		for(int i:numbers) {
			System.out.println("�ζ� ��ȣ:" + i);
			
		}
	}

}
