package ch04;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Oracle : �����ϱ�" + userInfo.getUserName());
		System.out.println("Oracle : �����ϱ�" + userInfo.getUserId());
		System.out.println("Oracle : �����ϱ�" + userInfo.getPassword());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Oracle : �����ϱ�" + userInfo.getUserName());
		System.out.println("Oracle : �����ϱ�" + userInfo.getUserId());
		System.out.println("Oracle : �����ϱ�" + userInfo.getPassword());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Oracle : �����ϱ�" + userInfo.getUserName());
		System.out.println("Oracle : �����ϱ�" + userInfo.getUserId());
		System.out.println("Oracle : �����ϱ�" + userInfo.getPassword());
	}
	

}
