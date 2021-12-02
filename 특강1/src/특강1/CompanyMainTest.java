package 특강1;

import java.util.Calendar;

public class CompanyMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//싱글톤 객체 사용 방법
		//클래스 이름으로 접근할수 있다.
		
		Company company1 =Company.getInstance();
		System.out.println(company1);
		
		Company company2 = Company.getInstance();
		System.out.println(company2);
		
		Student student = new Student(1,"야스오");
		System.out.println(student);
		Student student2 = new Student(2,"티모");
		System.out.println(student2);
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar);
	}

}
