package ch02;

public class Student {

	//��ü�� �Ӽ��� ��� ������,��ü�� ����� �޼���� �����Ѵ�.
	int studentId;
	String studentName;
	String address;
	
	//�޼��� ����
	public void study() {
		System.out.println(studentName+"�л��� ���θ� �մϴ�.");
	
	}
	public void breakTime() {
		System.out.println(studentName+"�л��� �޽��� �մϴ�.");
	}
	public void showIonfo() {
		System.out.println(studentId + "," + studentName + "," + address);
	}
	//1.������ ģ��.takeTest,StudentID + �л��� ������ ģ��.
	public void takeTest() {
		System.out.println(studentName + "�л��� ������ ģ��.");
	}
	public void cleanup() {
		System.out.println(studentName + "�л��� û�Ҹ� �Ѵ�.");
	}
	//�л��� �̸��� �����ϴ� �޼��� ����
	public String getName() {
		return studentName;
		
	}
	//�л��� ��ȣ�� �����ϴ� �޼��� ����
	public int getStudentId() {
		return studentId;
	}
	
	
	
}
