package ch02;

public class StudentMainTest {

	public static void main(String[] args) {

		Student studentKim=new Student();
		studentKim.studentName="김길동";
		studentKim.studentId=1;
		studentKim.address="부산시 진구";
		
		studentKim.study();
		studentKim.breakTime();
		studentKim.showIonfo();
		studentKim.takeTest();
		
		
		//!중요:메서드는 대체로 멤버 변수를 가지고 기능을 수행한다.
		
		System.out.println("==================");
		Student studentLee=new Student();
		studentLee.studentName="이순신";
		studentLee.studentId=2;
		studentLee.address="부산시 해운대구";
		
		studentLee.study();
		studentLee.breakTime();
		studentLee.showIonfo();
		studentLee.takeTest();
		
		System.out.println("========================");
		//1.studentKim 의 이름을 화면에 출력하세요.
		System.out.println(studentKim.getName());
		//2.studentKim 의 번호를 화면에 출력하세요.
		System.out.println(studentKim.getStudentId());
		//.studentLee 의 이름을 화면에 출력하세요.
		System.out.println(studentLee.getName());
		//.studentLee 의 번호를 화면에 출력하세요.
		System.out.println(studentLee.getStudentId());
	}

}
