package ch01;


class Cal{
	public int sum(int n1 , int n2){
		return n1 + n2;
	}
	
	public int multlplay(int n1 ,int n2) {
		return n1 * n2;
	}
	
}

class Cal2 extends Cal{
	public int mlnus(int n1,int n2) {
		return n1 - n2;
	}
	//�޼��带 ������ �Ҽ� �ִ�.
	//�������̵� (�θ� �ִ� �޼��带 �ʿ信 ���ؼ� ������ �Ͽ���.
	//public int multlplay(int n1 ,int n2) {
	//	if(n1 ==0 || n2 == 0) {
	//		System.out.println("0�� �Է����� ���ÿ�");
	//	}
	//	return n1 + n2;
	//}
	@Override
	public int multlplay(int n1, int n2) {
		// TODO Auto-generated method stub
		if(n1== 0 || n2 ==n2) {
			System.out.println("0�� ������� ���ÿ�");
		}
		return n1 * n2;
	}
	
	
}
public class MainTest2 {

	public static void main(String[] args) {
		
		Cal2 cal2 = new Cal2();
		System.out.println(cal2.sum(5, 3));
		System.out.println(cal2.multlplay(10, 7));
		System.out.println(cal2.mlnus(10, 0));

	}

}
