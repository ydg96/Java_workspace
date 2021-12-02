package 특강연습;

public class 학생클래스 {

	public int studentId;
	public String studentName;
	public String address;
	
	//public void showStudentInof() {
	//	System.out.println(studentName + "," + address);
	//}
	public String getStudentNAme() {
		return studentName;
	}
	
	public static void main(String[] args) {
		// Student studentLee = new Student();
		// studentLee.studentName = "이순신";
		// studentLee.address= " 서울";
		 
		// studentLee.showInfo();
		  Student studentKim = new Student();
		  studentKim.studentName ="김유신";
		  studentKim.address = "경주";
		  
		  studentKim.showInfo();
		  
		//  System.out.println(studentLee);
		  System.out.println(studentKim);
		  
		  Student studentLee = new Student();
			studentLee.studentName = "홍길동";
			System.out.println(studentLee);
			
		 
		 
		 
		 
	}
}
