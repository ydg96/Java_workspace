package Ư��1;

public class Student {

	int studntId;
	String studentNAme;

	// ���� �ڷ���(�������� ���� - ���԰���)
	Subject korea;
	Subject math;

	// ������
	public Student(int studntId, String studentNAme) {
		this.studntId = studntId;
		this.studentNAme = studentNAme;
		korea = new Subject();
		math = new Subject();
	}

	// �޼��� ����
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
		System.out.println("����� ������ " + total + "�Դϴ�");
		System.out.println("��ſ� �ܸ������� " + (total / 2) + "�Դϴ�");
	}

}// end of student

class Subject {

	String subjectName;
	int score;
	int sujectId;

}// end of subject