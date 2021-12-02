package ch02;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Activity1 activity1 =  new Activity1("엑티비티 1");
		 
		 Activity2 activity2  = new Activity2("엑티비티 2");
		 //메서드를 사용해서 콜백 연결하기
		 
		 activity2.setCallbackCheckPosition(activity1.callbackCheckPosition);
		 
		 
		 
		 
		 
		 
	}

}
