package ch02;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Activity1 activity1 =  new Activity1("��Ƽ��Ƽ 1");
		 
		 Activity2 activity2  = new Activity2("��Ƽ��Ƽ 2");
		 //�޼��带 ����ؼ� �ݹ� �����ϱ�
		 
		 activity2.setCallbackCheckPosition(activity1.callbackCheckPosition);
		 
		 
		 
		 
		 
		 
	}

}
