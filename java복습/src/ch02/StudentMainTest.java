package ch02;

public class StudentMainTest {

	public static void main(String[] args) {

		Student studentKim=new Student();
		studentKim.studentName="��浿";
		studentKim.studentId=1;
		studentKim.address="�λ�� ����";
		
		studentKim.study();
		studentKim.breakTime();
		studentKim.showIonfo();
		studentKim.takeTest();
		
		
		//!�߿�:�޼���� ��ü�� ��� ������ ������ ����� �����Ѵ�.
		
		System.out.println("==================");
		Student studentLee=new Student();
		studentLee.studentName="�̼���";
		studentLee.studentId=2;
		studentLee.address="�λ�� �ؿ�뱸";
		
		studentLee.study();
		studentLee.breakTime();
		studentLee.showIonfo();
		studentLee.takeTest();
		
		System.out.println("========================");
		//1.studentKim �� �̸��� ȭ�鿡 ����ϼ���.
		System.out.println(studentKim.getName());
		//2.studentKim �� ��ȣ�� ȭ�鿡 ����ϼ���.
		System.out.println(studentKim.getStudentId());
		//.studentLee �� �̸��� ȭ�鿡 ����ϼ���.
		System.out.println(studentLee.getName());
		//.studentLee �� ��ȣ�� ȭ�鿡 ����ϼ���.
		System.out.println(studentLee.getStudentId());
	}

}
