package 특강1;

public class Student {

	int studntId;
	String studentNAme;

	// 참조 자료형(컴포지션 관계 - 포함관계)
	Subject korea;
	Subject math;

	// 생성자
	public Student(int studntId, String studentNAme) {
		this.studntId = studntId;
		this.studentNAme = studentNAme;
		korea = new Subject();
		math = new Subject();
	}

	// 메서드 연습
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}

	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
	}

	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println("당신의 총점은 " + total + "입니다");
		System.out.println("당신에 외모점수는 " + (total / 2) + "입니다");
	}

}// end of student

class Subject {

	String subjectName;
	int score;
	int sujectId;

}// end of subject