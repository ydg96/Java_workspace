package ch09;

public class MainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ststicŬ���� �̸����� ���� �����ϴ�.
		int tempNumber = Employee.getSerialNum();
		System.out.println(tempNumber);
		
		Employee employee1 = new Employee("�̼���");
		Employee employee2 = new Employee("������");
		Employee employee3 = new Employee("Ƽ��");
	
		 System.out.println(employee1.getEmployeeid());
		 System.out.println(employee2.getEmployeeid());
		 System.out.println(employee3.getEmployeeid());
		 
	
	
	
	
	}

}
