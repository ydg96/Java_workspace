package 특강연습;

public class StudentMainTest {
//main 함수(코드의 시작점)
	public static void main(String[] args) {
	
		
		//Student1 student2 = new Student1();
		
		//객체를 생설할떄 사용하는 개발자 한테 값을 무조건 넣으라고 강제성을 부여 할수 있다.
		Student1 student3 = new Student1(1, "홍길동", 3);
		String showInfo =student3.showInfo();
		System.out.println(showInfo);
		System.out.println(student3.showInfo());
		
			
		
		
		
		
		
		
		
	}

}
