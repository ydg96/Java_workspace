package ch04;
//
//import java.util.Scanner;
//
//public class UserInfoClient {
//
//	// DB TYPE ����
//
//	// public static String DBTYPE = "ORACLE";
//	public static String DBTYPE = "MYSQL";
//	// public static String DBTYPE = ""MSSQL";
//
//	// ���� �Լ�
//	public static void main(String[] args) {
//
//		UserInfo userInfo = new UserInfo();
//		Scanner sc = new Scanner(System.in);
//
//		// ��������� userInfo ������ �޽��ϴ�.
//		System.out.println("����� �̸� �Է� : ");
//		userInfo.setUserName(sc.nextLine());
//		System.out.println("����� ���̵� �Է� : ");
//		userInfo.setUserId(sc.nextLine());
//		System.out.println("����� ��й�ȣ �Է� : ");
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
//		// 1. ȸ�� ���� �̶��
//		userInfoDao.insertUserInfo(userInfo);
//		// 2. ȸ�� ���� ���� �̶��
//		userInfoDao.updateUserInfo(userInfo);
//		// 3. ȸ�� Ż�� or ����
//		System.out.println(userInfoDao);
//	}
//}



public class UserInfoClient {
	// DBTYPE ���� 
		public static String DBTYPE = "MSSQL";
//		public static String DBTYPE = "MYSQL";
//		public static String DBTYPE = "ORACLE";
		public static void main(String[] args) {
			
			// ��������� userInfo ������ �޽��ϴ�. 
			UserInfo userInfo = new UserInfo(); 
			userInfo.setUserName("ȫ�浿");
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
			
//			// 1.ȸ�� �����̶�� 
			userInfoDao.insertUserInfo(userInfo);
//			// 2. ȸ�� ���� ���� �̶�� 
//			userInfoDao.updateUserInfo(userInfo);
//			// 3. ȸ�� Ż�� , ���� 
//			userInfoDao.deleteUserInfo(userInfo);
			System.out.println(userInfoDao);
			
			
			
		} // end of main 
	




}
