package ch05;

public class ContinueTest {

	public static void main(String[] args) {

		// ����� continue
		// �����ϰ� �����ϴ� continue

		int num;
		int count = 0;
		// ��� 2�� ����� ���ô�.
        final int MAX =1000;
        final int MULTIPLE=7;
		for (num = 1; num <= MAX; num++) {

			// 3�� ����̸� ��� ���� ���ÿ�.
			if (num % MULTIPLE == 0) {
				count++;
				continue;

			}
			//System.out.println("��°�:" + num);

		} // enf oof for

		System.out.println(MULTIPLE +"�� ��� ������:" + count);

	}// end of main

}// end of class
