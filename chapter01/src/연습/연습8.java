package ����;

public class ����8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1=10;
		int num2=20;
		//(&& ����) ������ ��� ���̸� ��� �� ��
		boolean flag = (num1 >= 9) && (num2 >= 1);
		System.out.println(flag);
		//||(����)�� ���߿� �ϳ��� �׸� ���̸� ��� �� ��
		//������ ��� �����̸� ��� ���� ����
		flag =(num1 < 9)||(num2 > 1);
		System.out.println(flag);
		//(!����)���� ������ ���� ��� �������� �ٲٰ�,������ ��� ��
	    flag =!(num1 < 0);
	    System.out.println(flag);
		
	}

}
