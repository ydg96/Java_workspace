package ch04;
//
//import java.util.Scanner;
//
//public class UserInfoClient {
//
//	// DB TYPE 설정
//
//	// public static String DBTYPE = "ORACLE";
//	public static String DBTYPE = "MYSQL";
//	// public static String DBTYPE = ""MSSQL";
//
//	// 메인 함수
//	public static void main(String[] args) {
//
//		UserInfo userInfo = new UserInfo();
//		Scanner sc = new Scanner(System.in);
//
//		// 사용자한테 userInfo 정보를 받습니다.
//		System.out.println("사용자 이름 입력 : ");
//		userInfo.setUserName(sc.nextLine());
//		System.out.println("사용자 아이디 입력 : ");
//		userInfo.setUserId(sc.nextLine());
//		System.out.println("사용자 비밀번호 입력 : ");
//		userInfo.setPassword(sc.nextLine());
//
//		UserInfoDao userInfoDao = null;
//		
//		if (DBTYPE.equals("MYSQL")) {
//			userInfoDao = new UserInfoMySqlDao();
//		} else if (DBTYPE.equals("ORACLE")) {
//			userInfoDao = new UserInfoOracleDao();
//		} else {
//			userInfoDao = new UserInfoMsSqlDao();
//		} // end of if
//
//		// 1. 회원 가입 이라면
//		userInfoDao.insertUserInfo(userInfo);
//		// 2. 회원 정보 수정 이라면
//		userInfoDao.updateUserInfo(userInfo);
//		// 3. 회원 탈퇴 or 정보
//		System.out.println(userInfoDao);
//	}
//}



public class UserInfoClient {
	// DBTYPE 설정 
		public static String DBTYPE = "MSSQL";
//		public static String DBTYPE = "MYSQL";
//		public static String DBTYPE = "ORACLE";
		public static void main(String[] args) {
			
			// 사용자한테 userInfo 정보를 받습니다. 
			UserInfo userInfo = new UserInfo(); 
			userInfo.setUserName("홍길동");
			userInfo.setUserId("myUserID");
			userInfo.setPassword("12345!@#");
			
			UserInfoDao userInfoDao = null; 
			
			if(DBTYPE.equals("MYSQL")) {
				userInfoDao = new UserInfoMySqlDao();
			} else if(DBTYPE.equals("ORACLE")) {
				userInfoDao = new UserInfoOracleDao();
			} else {
				userInfoDao = new UserInfoMySqlDao();
			} // end of if 
			
//			// 1.회원 가입이라면 
			userInfoDao.insertUserInfo(userInfo);
//			// 2. 회원 정보 수정 이라면 
//			userInfoDao.updateUserInfo(userInfo);
//			// 3. 회원 탈퇴 , 삭제 
//			userInfoDao.deleteUserInfo(userInfo);
			System.out.println(userInfoDao);
			
			
			
		} // end of main 
	




}
