package ����;

public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//�� ������ (&& , ||) ���ۼ�Ʈ,��Ƽ�� ��
		//���� �����ڿ� ȥ���Ͽ� ���� �����
		//���꿡 ����� true,false
		
		int num1 =10;
		int num2 =20;
		
		boolean flag =(num1 > 0)&&(num2 > 0);
		//����(&&)������ �ΰ��߿� �ϳ��� �����̸� ����.
		System.out.println(flag);
		boolean flag1 =(num1 < 0)||(num2 > 0);
		//�� ��(||)������ ���� �ϳ��� ���̸� ��.�ΰ��� �����̸� ����.
		System.out.println(flag1);
	}

}
