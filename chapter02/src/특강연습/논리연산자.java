package Ư������;

public class �������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�� ������(&& , ||)
		//���� �����ڿ� ȥ���Ͽ� ���� ����
		//���꿡 ����� true , false
        int num1 =10;
        int num2 =20;
        
        //����(&&)
        //�ΰ��߿� �ϳ��� false�̸� false��ȯ
        boolean flag1=(num1>0) && (num2 > 0);
        System.out.println(flag1);
        
        //���� (||)
        //�ΰ��߿� �ϳ��� true�̸� true��ȯ
        boolean flag2=(num1<0)||(num2 <0);
        System.out.println(flag2);
        
	}//end of main

}//end of class
