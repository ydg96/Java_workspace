package Ư������;

public class UserInfo {

	public String userId;
	public String userpassword;
	public String userNAme;
	public String userAddress;
	public String userNumber;
	
	//������ �����ε�
	
	//�⺻������
	public UserInfo() {
		
	}
	//������ 1        //�Ű�����
	public UserInfo(String userId) {
		this.userId = userId;
	}
	//������ 2
	public UserInfo(String userId, String userpassword) {
		super();
		this.userId = userId;
		this.userpassword = userpassword;
	}
	//������ 3
	public UserInfo(String userId, String userpassword, String userNAme) {
		super();
		this.userId = userId;
		this.userpassword = userpassword;
		this.userNAme = userNAme;
	}
	//������ 4
	public UserInfo(String userId, String userpassword, String userNAme, String userAddress) {
		super();
		this.userId = userId;
		this.userpassword = userpassword;
		this.userNAme = userNAme;
		this.userAddress = userAddress;
	}
	//������ 5
	public UserInfo(String userId, String userpassword, String userNAme, String userAddress, String userNumber) {
		super();
		this.userId = userId;
		this.userpassword = userpassword;
		this.userNAme = userNAme;
		this.userAddress = userAddress;
		this.userNumber = userNumber;
	}
	public static void main(String[] args) {
		UserInfo userInfo1 = new UserInfo("100");
		System.out.println(userInfo1.userId);
	
	UserInfo userInfo2 =new UserInfo("101" , "abc123");
	System.out.println(userInfo2.userId);
	System.out.println(userInfo2.userpassword);
	}
	
	
}
