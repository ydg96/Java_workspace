package Ư��1;

import java.util.Calendar;

public class CompanyMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�̱��� ��ü ��� ���
		//Ŭ���� �̸����� �����Ҽ� �ִ�.
		
		Company company1 =Company.getInstance();
		System.out.println(company1);
		
		Company company2 = Company.getInstance();
		System.out.println(company2);
		
		Student student = new Student(1,"�߽���");
		System.out.println(student);
		Student student2 = new Student(2,"Ƽ��");
		System.out.println(student2);
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar);
	}

}
