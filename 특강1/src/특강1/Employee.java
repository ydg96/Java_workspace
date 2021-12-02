package 특강1;

public class Employee {

	public static int seriaNum = 1000;
	
	//정보은닉
	private  int employeeId;
	private String employName;
	private String department;
	
	//생성자
	public Employee() {
		seriaNum++;
		this.employeeId = seriaNum;
		
	}
	
	//get, set 
	
	public int getEmployeeId() {
		return this.employeeId;
	}
	
	//employeeId xxxx set 만들지 않기

	//employName , department -->getter , setter 만들기 연습
	
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
