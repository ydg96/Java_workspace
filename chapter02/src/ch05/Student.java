package ch05;

public class Student {

	//�й�
	int StudentId;
	//�л� �̸�
	String name;
	Subjet korea;
	Subjet math;
	
	public Student(int studentId, String name){
		this.StudentId =studentId;
		this.name = name;
		korea = new Subjet();
		math = new Subjet();
	}
    //���� ���� ����
	public void setKoreaSubject(String name, int score) {
		korea.SubjetName = name;
		korea.score = score;
	}
	//���� ���� ����
	public void setMathSubject(String name, int score) {
		math.SubjetName = name;
		math.score = score;
	}
	public void showStudentScore() {
		int total=korea.score + math.score;
		System.out.println("�л��� �̸���:" + name);
		System.out.println("�л��� ������:" + total);
		System.out.println("�л��� �����:" + total / 2);
	}
}
