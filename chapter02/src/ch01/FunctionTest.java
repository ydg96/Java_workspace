package ch01;


//�����Լ�(�ڵ忡 ������)
public class FunctionTest {
	
	public static void main(String[] args) {

		//�Լ� ����غ���
		int result1 = add(100,50);
	    System.out.println(result1);	
	    
	    int result2 =add(200, 300);
	    System.out.println(result2);
 }//end of main
 //add�Լ� ����
	public static int add(int num1,int num2) {
		//�Լ��ȿ� ����ϴ� ������ ����������� �θ���.
		int result;
		result = num1 + num2;
		return result;
		
	}

}