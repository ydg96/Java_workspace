package ch02;

public class ForMainTest1 {

	// �����Լ�(�ڵ��� ������)
	public static void main(String[] args) {

		// ���� for�� ����
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("��");
		System.out.println("��");
		System.out.println("-------------");

		for (int i = 6; i <= 1; i++) {

			for (int j = 0; j > i; j++) {
				System.out.print("*");

			} // end of for - j
			System.out.println();

		} // end of for - i

	}// end of main

}// end of class
