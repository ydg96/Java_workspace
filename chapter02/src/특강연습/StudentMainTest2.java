package 특강연습;

public class StudentMainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentKim = new Student();
		studentKim.studentName ="김길동";
		studentKim.studentId = 1;
		studentKim.address = "부산진구";
		
		studentKim.study();
		studentKim.breakTime();
		studentKim.showInfo();
		
		
		//중요! 메서드는 대체로 멤버 변수를 가지고 기능을 수행한다.
		
	
		Student studentLee = new Student();
	    studentLee.studentName = "이순신";
	    studentLee.studentId = 2;
	    studentLee.address ="부산시 해운대구";
	    
	    studentLee.study();
	    studentLee.breakTime();
	    studentLee.showInfo();

	    System.out.println("=============");
	    System.out.println(studentKim.getName());
	    System.out.println(studentKim.getstudentId());
	    System.out.println(studentLee.getName());
	    System.out.println(studentLee.getstudentId());
	}

	//함수
	//자바에서 함수란 객체롸 상관없이 독립적으로 기능을 수행하는 일련코드이다.
	public static double addDouble(double n1,double n2) {
		return n1 + n2;
	}
	
}
