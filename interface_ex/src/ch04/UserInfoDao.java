package ch04;


//�ְ� ���� �����ڰ� �������̽��� �����ؼ�
//���������� Ŭ����Ʈ�� �ڵ��� �ñ�
//�������� ����,�������� DB�� ���� �ڵ��� �ñ�
//�������̽�(�Ծ�,���)�� ����� ���� �ʴ´ٸ�
//���� �����ڰ� �۾��� ���������� ��ٷ��� �մϴ�.
//�� ���߽ð� ���� --> ���ߺ�� ����
public interface UserInfoDao {

	//Ŭ���̾�Ʈ �����ڴ� �Ű������� userInfo ��ü�� �Ѱ��ָ� �˴ϴ�.
	//DB �����ڵ� userInfo ��ü�� �Ѱ� �޾Ƽ� �ڵ��� ���ָ� �˴ϴ�.
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
	
}
