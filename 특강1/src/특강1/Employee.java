package Ư��1;

public class Employee {

	public static int seriaNum = 1000;
	
	//��������
	private  int employeeId;
	private String employName;
	private String department;
	
	//������
	public Employee() {
		seriaNum++;
		this.employeeId = seriaNum;
		
	}
	
	//get, set 
	
	public int getEmployeeId() {
		return this.employeeId;
	}
	
	//employeeId xxxx set ������ �ʱ�

	//employName , department -->getter , setter ����� ����
	
	public String getEmloyName() {
		return employName;
	}
	public void setEmployName(String employName) {
		this.employName = employName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
