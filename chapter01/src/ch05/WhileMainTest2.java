package ch05;

public class WhileMainTest2 {

	public static void main(String[] args) {
	
		
		//1���� 10���� ���ؼ� ������� ���
		int num=1;
		int snm=0;//<-����� ���
		final int LIMIT_VALUE =10;
		
		//while ���� ����ؼ� 1�� 10���� ���� ����� ����� ������.
		 
		while (num <= LIMIT_VALUE) {
			snm=snm + num;
			num = num +1;
			//num++
		}
        System.out.println("�����:"+snm);
	}

}
