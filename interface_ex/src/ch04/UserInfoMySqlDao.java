package ch04;

public class UserInfoMySqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Mysql : 저장하기" + userInfo.getUserName());
		System.out.println("Mysql : 저장하기" + userInfo.getUserId());
		System.out.println("Mysql : 저장하기" + userInfo.getPassword());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Mysql : 수정하기" + userInfo.getUserName());
		System.out.println("Mysql : 수정하기" + userInfo.getUserId());
		System.out.println("Mysql : 수정하기" + userInfo.getPassword());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Mysql : 삭제하기" + userInfo.getUserName());
		System.out.println("Mysql : 삭제하기" + userInfo.getUserId());
		System.out.println("Mysql : 삭제하기" + userInfo.getPassword());
	}
	

	
}
