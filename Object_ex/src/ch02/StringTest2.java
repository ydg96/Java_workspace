package ch02;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ѹ������� String �Һ�(immutable)
		
		//String�� �����ϸ� ������ String�� ����Ǵ� ���� �ƴ�
		//���ο� ���ڿ��� �����ȴ�.
		String java = new String("java");
		String android = new String("Android");
		
		//String ������ �ּҰ��� Ȯ���غ��� �ʹٸ�
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		System.out.println(android);
		
		System.out.println("-----------------------");
		//java = java + android;
		java =java.concat(android);
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
	}

}
