package ch01;

public class StudentMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object ob; 
		Student student1 = new Student(1, "ȫ�浿"); 
		Student student2 = new Student(2, "Ƽ��");
		Student student3 = new Student(2, "Ƽ��");
		
		// toString
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		System.out.println("-------------------");
		
		if(student3.equals(student2)) {
			System.out.println("���� :  ���� ��ü �Դϴ�." );
		} else {
			System.out.println("���� :  �ٸ� ��ü �Դϴ�." );
		}


	}

}
