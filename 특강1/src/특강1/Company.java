package Ư��1;

public class Company {

	//1.�����ڸ� private�� �����.
	
	private Company() {
		
	}
	
	//2.static ������ Ȱ���ؼ� ���ο� ��ü�� �����Ѵ�.
	private static Company instance = new Company();
	
	//3.�ܺο��� ������ �ν��Ͻ��� ������ �� �ִ� public �޼��带 �����Ѵ�.
	public static Company getInstance() {
		
		//����� �ڵ���
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
