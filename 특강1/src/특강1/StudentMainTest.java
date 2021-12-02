package 특강1;

import java.util.Scanner;

public class StudentMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//설계된 클래스를 가지고 사용하는 입장에서 요구사항에 맞게
		//또는 여러분이 만들고 싶은 로직을 코드로 구현할 수 있다.
		
		Student studentKim = new Student(200,"김씨");
		Scanner scanner = new Scanner(System.in);
		
		//국어
		System.out.println("외적인 점수를 입력하세요.");
		String subject1 = scanner.next();
		System.out.println("내적인 점수를 입력하세여.");
		int score1 = scanner.nextInt();
		
		//국어를 셋팅하는 메서드 사용
		studentKim.setKoreaSubject(subject1, score1);
		
		//수학
		System.out.println("외적인 점수를 입력하세요.");
		String Subject2 = scanner.next();
		System.out.println("내적인 점수를 입력하세여.");
		int score2 = scanner.nextInt();
		
		//수학을 셋팅하는 메서드 사용
		studentKim.setMathSubject(Subject2, score2);
		
		System.out.println("-----------------------");
		studentKim.showStudentScore();
		System.out.println("------------------------");
	}

}
