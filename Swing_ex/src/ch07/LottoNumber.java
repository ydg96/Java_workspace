package ch07;

import java.util.Random;

public class LottoNumber {

	final int LOTTO_NUMBER_SIZE =6;
	public int[]getLottoNumber(){
		
		//��ȣ�� ���� ���� �����
		int[]numbers =new int [LOTTO_NUMBER_SIZE ];
		Random random =new Random();
		
		for(int i =0; i < numbers.length; i++) {
			int selectendNumber = random.nextInt(45) + 1;
		}
		return numbers;
	}
}
