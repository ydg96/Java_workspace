package Ư������;
//Ŭ������ ��ü�� ������� ���赵�� �Դϴ�.
public class Student {

   //��ü�� �Ӽ��� ��� ������,��ü�� ����� �޼���� �����Ѵ�.
   int studentId;
   String studentName;
   String address;
    
   //�޼��� ����
   public void study() {
	   System.out.println(studentName + "�л��� ���θ� �մϴ�.");
	}
	//
   public void breakTime() {
	   System.out.println(studentName + "�л��� �޽��� �մϴ�.");
   }
	//
   public void showInfo() {
	   System.out.println(studentId + "studentName" + "," + address);
   }
   public void takeTest() {
	System.out.println(studentId + "�л��� ������ ģ��.");
}
	public void cleanUp() {
		System.out.println(studentId + "�л��� û�Ҹ� �Ѵ�.");
	}
	//�л��� �̸��� �����ϴ� �޼��� ����
	public String getName() {
		return studentName;
	}
	//�л��� ��ȣ�� �����ϴ� �޼��� ����
	public int getstudentId() {
		return studentId;
	}
	
 }