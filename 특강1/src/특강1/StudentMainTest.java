package Ư��1;

import java.util.Scanner;

public class StudentMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����� Ŭ������ ������ ����ϴ� ���忡�� �䱸���׿� �°�
		//�Ǵ� �������� ����� ���� ������ �ڵ�� ������ �� �ִ�.
		
		Student studentKim = new Student(200,"�达");
		Scanner scanner = new Scanner(System.in);
		
		//����
		System.out.println("������ ������ �Է��ϼ���.");
		String subject1 = scanner.next();
		System.out.println("������ ������ �Է��ϼ���.");
		int score1 = scanner.nextInt();
		
		//��� �����ϴ� �޼��� ���
		studentKim.setKoreaSubject(subject1, score1);
		
		//����
		System.out.println("������ ������ �Է��ϼ���.");
		String Subject2 = scanner.next();
		System.out.println("������ ������ �Է��ϼ���.");
		int score2 = scanner.nextInt();
		
		//������ �����ϴ� �޼��� ���
		studentKim.setMathSubject(Subject2, score2);
		
		System.out.println("-----------------------");
		studentKim.showStudentScore();
		System.out.println("------------------------");
	}

}
