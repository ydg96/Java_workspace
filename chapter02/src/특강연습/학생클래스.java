package Ư������;

public class �л�Ŭ���� {

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
		// studentLee.studentName = "�̼���";
		// studentLee.address= " ����";
		 
		// studentLee.showInfo();
		  Student studentKim = new Student();
		  studentKim.studentName ="������";
		  studentKim.address = "����";
		  
		  studentKim.showInfo();
		  
		//  System.out.println(studentLee);
		  System.out.println(studentKim);
		  
		  Student studentLee = new Student();
			studentLee.studentName = "ȫ�浿";
			System.out.println(studentLee);
			
		 
		 
		 
		 
	}
}
