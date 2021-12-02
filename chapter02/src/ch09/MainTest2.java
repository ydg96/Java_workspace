package ch09;

public class MainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ststic클래스 이름으로 접근 가능하다.
		int tempNumber = Employee.getSerialNum();
		System.out.println(tempNumber);
		
		Employee employee1 = new Employee("이순신");
		Employee employee2 = new Employee("김유신");
		Employee employee3 = new Employee("티모");
	
		 System.out.println(employee1.getEmployeeid());
		 System.out.println(employee2.getEmployeeid());
		 System.out.println(employee3.getEmployeeid());
		 
	
	
	
	
	}

}
