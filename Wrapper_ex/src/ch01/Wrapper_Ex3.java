package ch01;

public class Wrapper_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		String b = a + ":...";

		String str = "10";
		String str2 = "10.5";
		String str3 = "true";

		int i = Integer.parseInt(str);
		System.out.println("���ڿ���  int ������ ��ȯ: " + i);

		// double
		double d = Double.parseDouble(str2);
		System.out.println("���ڿ��� double ������ ��ȯ: " + d);

		// boolean
		boolean bo = Boolean.parseBoolean(str3);
		System.out.println("���ڿ��� boolean ������ ��ȯ:" + bo);

	}

}
