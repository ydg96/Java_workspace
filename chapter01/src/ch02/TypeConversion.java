package ch02;

public class TypeConversion {

	// �����Լ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �� ��ȯ
		// ������ �� ��ȯ(�ڵ� �� ��ȯ)
		// ����� �� ��ȯ(���� �� ��ȯ)

		// =>���� �ٸ� �ڷ��� ���� ������� ������ ���� �ϳ��� �ڷ������� ���� �ϴ°��� ����.
		// int �ڷ����� double ������ �����ϰų� double���� int�� ���� �ϴ°� ���մϴ�.

		int iNum1 = 100;
		System.out.println(iNum1);

		// �ڵ� �� ��ȯ
		double dNum1 = iNum1;
		System.out.println(dNum1);

		// ���� �� ��ȯ
		double dNumber = 1.12341;
		// int iNumber = dNumber;���� :�������ڿ��� ū���ڷ� �ٷ� ���� �� ����.
		
		//�����ڰ� �����Ϸ��� �������ϱ� �׳� ������ �־�!!!
		int iNumber = (int)dNumber;
		System.out.println(iNumber);
		//�Ҽ����� �׳� ������ ���� ����
		
		//����
		double aValue;
		int bValue;
		
		aValue=0.5;
		bValue=(int)10.1;
		//���� bValue ��� ���� �� �ϱ��?
		//��.10
		System.out.println(bValue);
		

	}//end of main

}//end of calss
