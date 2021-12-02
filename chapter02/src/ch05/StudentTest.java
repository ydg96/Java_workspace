package ch05;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student studentLee = new Student(10, "Lee");
		studentLee.setKoreaSubject("국어", 100);
	    studentLee.setMathSubject("수학", 80);
	
	    //error
	    studentLee.showStudentScore();
	    
	
	    //문제1.
	    //학생 studentKim생성
	    //국어 셋팅
	    //수학 셋팅
	    //총점 출력
	    Student studentKim = new Student(10, "Kim");
		studentLee.setKoreaSubject("국어", 90);
	    studentLee.setMathSubject("수학", 100);
	
	    //error
	    studentLee.showStudentScore();
	
	
	
	
	
	
	}   
	
	

}
