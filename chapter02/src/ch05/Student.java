package ch05;

public class Student {

	//학번
	int StudentId;
	//학생 이름
	String name;
	Subjet korea;
	Subjet math;
	
	public Student(int studentId, String name){
		this.StudentId =studentId;
		this.name = name;
		korea = new Subjet();
		math = new Subjet();
	}
    //국어 성적 셋팅
	public void setKoreaSubject(String name, int score) {
		korea.SubjetName = name;
		korea.score = score;
	}
	//수학 성적 셋팅
	public void setMathSubject(String name, int score) {
		math.SubjetName = name;
		math.score = score;
	}
	public void showStudentScore() {
		int total=korea.score + math.score;
		System.out.println("학생의 이름은:" + name);
		System.out.println("학생의 총점은:" + total);
		System.out.println("학생의 평균은:" + total / 2);
	}
}
