package 특강연습;

public class 형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 데이터의 형 변환
		// int 자료형을 double로 변경하거나
		// double 자료형을 int 형으로 변경하는 것을 말합니다.

		int iNum1 = 100;
		System.out.println(iNum1);

		double dNum1 = iNum1;
		System.out.println(dNum1);

		// 강제 형 변환
		double dNumber = 1.12341;
		// 컴파일러가 작은 상자에 큰 상자(값을)넣을수 없다.하지만 강제로 값을 넣어라고 주문.
		int iNumber = (int) dNumber;

		System.out.println(iNumber);

		// 연습
		double aValue;
		int bValue;

		aValue = 0.5;

		bValue = (int) 10.1;
		System.out.println(bValue);
	}

}
