package ch04;

public class UserInfoMySqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Mysql : �����ϱ�" + userInfo.getUserName());
		System.out.println("Mysql : �����ϱ�" + userInfo.getUserId());
		System.out.println("Mysql : �����ϱ�" + userInfo.getPassword());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Mysql : �����ϱ�" + userInfo.getUserName());
		System.out.println("Mysql : �����ϱ�" + userInfo.getUserId());
		System.out.println("Mysql : �����ϱ�" + userInfo.getPassword());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Mysql : �����ϱ�" + userInfo.getUserName());
		System.out.println("Mysql : �����ϱ�" + userInfo.getUserId());
		System.out.println("Mysql : �����ϱ�" + userInfo.getPassword());
	}
	

	
}
