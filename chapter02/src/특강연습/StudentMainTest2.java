package Ư������;

public class StudentMainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentKim = new Student();
		studentKim.studentName ="��浿";
		studentKim.studentId = 1;
		studentKim.address = "�λ�����";
		
		studentKim.study();
		studentKim.breakTime();
		studentKim.showInfo();
		
		
		//�߿�! �޼���� ��ü�� ��� ������ ������ ����� �����Ѵ�.
		
	
		Student studentLee = new Student();
	    studentLee.studentName = "�̼���";
	    studentLee.studentId = 2;
	    studentLee.address ="�λ�� �ؿ�뱸";
	    
	    studentLee.study();
	    studentLee.breakTime();
	    studentLee.showInfo();

	    System.out.println("=============");
	    System.out.println(studentKim.getName());
	    System.out.println(studentKim.getstudentId());
	    System.out.println(studentLee.getName());
	    System.out.println(studentLee.getstudentId());
	}

	//�Լ�
	//�ڹٿ��� �Լ��� ��ü�� ������� ���������� ����� �����ϴ� �Ϸ��ڵ��̴�.
	public static double addDouble(double n1,double n2) {
		return n1 + n2;
	}
	
}
