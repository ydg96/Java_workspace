package ch01;

public class FunctionMainTest2 {

	public static void main(String[] args) {

		int num1=10;
		int num2=20;
		
		int total=addNum(num1,num2);
		sayHello("�ݰ����ϴ� �ȳ��ϼ���");
		int sum=calcSum();
		
		System.out.println(total);
		System.out.println(sum);
		
		int n1=20;
		int n2=10;
		int n3=30;
		
		double d1=1.8;
		double d2=2.2;
		
		int to=intAdd(n1,n2,n3);
		int to1=(int)doubleAdd(d1,d2);
		printArticle("������");
		
		System.out.println(to);
		System.out.println(to1);
		
	}// end of main

	// addNum
	public static int addNum(int n1, int n2) {
		// �Լ� �ȿ��� ���Ǵ� ������ ���� ������� �մϴ�.
		int result;
		result = n1 + n2;
		return result;
	}// end of addNum

	// ���ϰ��� ���� �Լ� void
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}

	// �Ű� ������ ���� �Լ�
	public static int calcSum() {
		int sum = 0;
		int i;
		for (i = 0; i < 100; i++) {
			sum += i;
		}
		return sum;
	}//end of calc
	
	//�Լ��� ����� ���ô�.
	//1.���ϰ��� int �Ű����� n1,n2,n3(int)�̸��� intAdd
	public static int intAdd(int n1,int n2,int n3) {
		int result;
		result =n1+n2+n3;
		return result;
	}
	//2.���ϰ��� double �Ű������� d1,d2(double) �̸��� doubleAdd
	public static double doubleAdd(double d1,double d2) {
		int result; 
		result=(int)(d1+d2);
		return result;
	}
	//2.���ϰ��� void �Űܺ��� String article �̸��� printArticle
	
	public static void printArticle(String article) {
		System.out.println(article);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
