package ch03;

public class OperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.�� ���� ���� ���� �Ͽ� result1 ������ ���
		//����� 30.5�� ��� �ϼ���.
		int i=10;
		double d =20.5;
		double result1=i+d;
		System.out.println(result1);
    
        
        //2.result1 ������ ���������� ���� �� ��ȯ �ؼ� ����ϼ���.
	    System.out.println((int)result1);
		
		
		//3.i ������ ���� -1�� �� �� ����ϼ���.
		//��,���� ������ ���
		System.out.println(--i);
		
		//4.d������ ���� -20.5�� ��� �ϼ���.
		//��,d������ ���� �������� ������.
		System.out.println(-d);
		//5.���� i�� d,���� �����ڸ� ����ؼ� result2������ 
		//�����ϰ� ������ true ���� ��⵵�� ���� ����� ����ϼ���
	    boolean result2=i < d;
		System.out.println(result2);
		
		
		//6.���� result3�� �����ϰ�
		//num1�� num2 ������ ���� 50���� ū�� �� �����ڸ� ����ؼ� 
		//����� ��� ����ϼ���.	
		int num1=10;
		int num2=30;
		
		boolean result3=(num1 > 50) &&( num2 > 50);
		System.out.println(result3);
		
		
		//7.num1�� num2�� �� ū ���� ���� �����ڸ� ����ؼ�
		//max ������ ���� ��� ������ּ���
		//��,����� �ʱ�ȭ�� ���ÿ� ���ּ���.
		int max =(num1 >= num2)?num1 : num2;
		System.out.println(max);
		
		//�������� 2
		
		//1.��
		//���� >1byte:boolean
		//������ >2byte:char
		//������ >3byte:byte,2byte:shoet,4byte:int,8byte:long
		//�Ǽ��� >4byte:float,8byte:double
		
		//2.��
		long regNo =9811071234556L;
		
		//3.��
	    //���ͷ�:100,100,3.14
		//����: i , iNum
		//Ű����(�����):int,long,final,float
		//���:f,PI
		
		//4.��
		System.out.println("1"+"2");//->("12")
		System.out.println(true+"");//->("true")
		System.out.println('A'+'B');//->(131)//���ڴ� ������ �����
		System.out.println('1'+2);//->(51)
		System.out.println('1'+'2');//->(99)
		System.out.println('J'+"ava");//->("Java")
		
		//5.��
		//a.$ystem
		//b.channel#5
		//c.7eleven
		//d.If
		//f.new
		//g.$MAX_NUM
		//h.hello@com
		
		//g(�빮�ڵ� �����ϱ���)
		
		
		
	}//end of main

}//end of class
