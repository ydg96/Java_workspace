package ch02;

public class Student {

	//객체의 속성은 멤버 변수로,객체의 기능은 메서드로 구현한다.
	int studentId;
	String studentName;
	String address;
	
	//메서드 정의
	public void study() {
		System.out.println(studentName+"학생이 공부를 합니다.");
	
	}
	public void breakTime() {
		System.out.println(studentName+"학생이 휴식을 합니다.");
	}
	public void showIonfo() {
		System.out.println(studentId + "," + studentName + "," + address);
	}
	//1.시험을 친다.takeTest,StudentID + 학생이 시험을 친다.
	public void takeTest() {
		System.out.println(studentName + "학생이 시험을 친다.");
	}
	public void cleanup() {
		System.out.println(studentName + "학생이 청소를 한다.");
	}
	//학생에 이름을 리턴하는 메서드 정의
	public String getName() {
		return studentName;
		
	}
	//학생에 번호를 리턴하는 메서드 정의
	public int getStudentId() {
		return studentId;
	}
	
	
	
}
