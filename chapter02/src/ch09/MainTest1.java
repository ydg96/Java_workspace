package ch09;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static 태양 ->객체 생성과 상관 없이 미리 할당 되어있다.
		System.out.println(NumberPrinter.waitNumber);
		NumberPrinter numberPrinter1 = new NumberPrinter(1);
		NumberPrinter numberPrinter2 = new NumberPrinter(2);
		//왼쪽 기계
		//1.번호표를 뽑음
		numberPrinter1.ptintWaitNumber();
		//2.'''
		numberPrinter1.ptintWaitNumber();
		numberPrinter1.ptintWaitNumber();
		numberPrinter1.ptintWaitNumber();

		
		//오른쪽 기계
		numberPrinter2.ptintWaitNumber();
		numberPrinter2.ptintWaitNumber();
		numberPrinter2.ptintWaitNumber();
		numberPrinter2.ptintWaitNumber();
		numberPrinter2.ptintWaitNumber();
		
		
		
		
		
	}

}
