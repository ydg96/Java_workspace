package ch05;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student studentLee = new Student(10, "Lee");
		studentLee.setKoreaSubject("����", 100);
	    studentLee.setMathSubject("����", 80);
	
	    //error
	    studentLee.showStudentScore();
	    
	
	    //����1.
	    //�л� studentKim����
	    //���� ����
	    //���� ����
	    //���� ���
	    Student studentKim = new Student(10, "Kim");
		studentLee.setKoreaSubject("����", 90);
	    studentLee.setMathSubject("����", 100);
	
	    //error
	    studentLee.showStudentScore();
	
	
	
	
	
	
	}   
	
	

}
