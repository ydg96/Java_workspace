package ch01;

public class MainTest1 {

	public static void main(String[] args) {

		//�� ������(&&,||)
		//���� �����ڿ� ȥ���Ͽ� ���� ��� ��
		//���꿡 ����� true,false
		
		int num1=10;
		int num2=20;
		
		//1.���� (&&)
		boolean flag1=(num1>0)&&(num2>0); //�Ѵ� ���̸� ��
		System.out.println(flag1);
		
		boolean flag2=(num1>0)&&(num2 <0);//���� �ϳ��� �����̸� ����
		System.out.println(flag2);
		
		//2.����(||)
		boolean flag3=(num1 >0)||(num2 >0);//�Ѵ� ���̐� ��
		System.out.println(flag3);
		
		boolean flag4=(num1<0)||(num2 >0);//���� �ϳ��� ���̶�� ��
		System.out.println(flag4);
		
		
		
	}

}
