package 특강연습;

public class UserInfo {

	public String userId;
	public String userpassword;
	public String userNAme;
	public String userAddress;
	public String userNumber;
	
	//생성자 오버로딩
	
	//기본생성자
	public UserInfo() {
		
	}
	//생성자 1        //매개변수
	public UserInfo(String userId) {
		this.userId = userId;
	}
	//생성자 2
	public UserInfo(String userId, String userpassword) {
		super();
		this.userId = userId;
		this.userpassword = userpassword;
	}
	//생성자 3
	public UserInfo(String userId, String userpassword, String userNAme) {
		super();
		this.userId = userId;
		this.userpassword = userpassword;
		this.userNAme = userNAme;
	}
	//생성자 4
	public UserInfo(String userId, String userpassword, String userNAme, String userAddress) {
		super();
		this.userId = userId;
		this.userpassword = userpassword;
		this.userNAme = userNAme;
		this.userAddress = userAddress;
	}
	//생성자 5
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
