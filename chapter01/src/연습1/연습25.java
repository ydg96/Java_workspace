package ����1;

public class ����25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����� continue
		//�����ϰ� �����ϴ� continue
		
		int sum;
		int count =0;
		final int MULTIPLE =1000;
		
		for(sum = 1; sum <= MULTIPLE; sum++) {
			
			//3�� ����̸� ������� ���ÿ�.
			if(sum % 3 == 0){
				count++;
				continue;
		}
		System.out.println("��°�: " + sum);
		}
		
		System.out.println("��°�:" + count);
		
		
	}

}
