package 특강1;

public class MainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//직원 객체
		
		Employee employee1 = new Employee();
		employee1.setEmployName("이순신");
		//직원에 이름,사원번호 출력
		System.out.println(employee1.getEmloyName());
		System.out.println(employee1.getEmployeeId());
		
		//직원객체 2생성
		Employee employee2 = new Employee();
		employee2.setEmployName("김유신");
		System.out.println(employee2.getEmloyName());
		System.out.println(employee2.getEmployeeId());
			
	
	
	
	}

}
