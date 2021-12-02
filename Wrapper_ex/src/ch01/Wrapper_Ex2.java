package ch01;

public class Wrapper_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer num =17; //박싱 (자바에서 알아서 자동박싱해줌)
		int n =num; //자동변환 후 언박싱(자동 언박싱)
		
		Integer num2 =new Integer(n); //자동 언박싱에서 다시 변환
		System.out.println(n);
		
	}

}
