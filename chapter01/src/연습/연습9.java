package ����;

public class ����9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 = 5;
		int i = 0;
		//������ ������ ����� ��� true�ϋ��� ����� true
		//--���� ���� ����� flase�̸� �� ���� ����� ������ ����
		boolean value =((num1= num1 + 10)> 10)&&((i = i + 2) < 10);
		 //5 = 5 + 10 < 10 (*) 0 = 0 +2 < 10
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		       
		//������ ������ ����� ��� false�� ���� ����� false
		//--���� ���� ����� true�̸� �� ���� ����� ������ ����
		value =((num1 = num1 +100 )> 10)||((i = i + 2 ) < 10);
		 //5 = 5 + 10 < 10 (+)(0 = 0 + 2 <10
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
	}

}
