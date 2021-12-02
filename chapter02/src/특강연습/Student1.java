package 특강연습;

public class Student1 {

	// 생성자 - constructor
	// 객체를 생성할때 다음과 같은 모양으로 만들어라고 지시하는것
	// 객체를 생설할때 강제성을 부여하는 것
	int number; // 이런것들이 멤버변수.
	String name;
	int grade;

	// 생성자 정의(개발자가 직접 정의)
	public Student1(int number, String name, int grade) {
		// this란 자기 자신을 가리킨다.(자기 자신의 주소값)
		this.number = number;
		this.name = name;
		this.grade = grade;

		// 객체화(인스턴스) 될떄 생성자는 제일 처음 수행하는 코드이다.
	    System.out.println("객체를 생성 합니다.");
		//showInfo();
	}

	//개발자가 직접 생성자를 만들지 않으면
	//기본적으로 컴파일러가 기본 생성자를 만들어 준다.
	public Student1() {
		
	}
	
	// 메서드(리턴타입 String (뒤에는 소문자로 시작)
	public String showInfo() {
		return name + "학생의 학번은" + number + "이고" + grade + "입니다.";
	}

}
