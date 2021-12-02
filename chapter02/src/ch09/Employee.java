package ch09;

public class Employee {
	
	public static int serialNum =1000;

	
	private int employeeId;
	private String employeeName;
	private String department;
	
	public Employee(String employeeName) {
		serialNum++;
		employeeId=serialNum;
	}
	
	//����1.getEmployeeId
	public int getEmployeeid() {
		return employeeId;
	}
	//����2.getEmployeeName
	public String getEmployeeName() {
		return employeeName;
	}
	//����3.getDepartment
	public String getDepartment() {
		return department;
	}
	public static int getSerialNum(){
		//���� static �޼��� �ȿ����� ��� ������ ����� �� ����.
		//why :��ü�� ��������� ���� �����ؼ� ����Ҽ� ���� �����Դϴ�.
		//department = "ȫ����";
	    return serialNum;
	}
}

