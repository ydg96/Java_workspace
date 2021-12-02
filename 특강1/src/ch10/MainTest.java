package ch10;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberPrinter numberPrinter1 =new NumberPrinter(1);
		NumberPrinter numberPrinter2 =new NumberPrinter(2);
		NumberPrinter numberPrinter3 =new NumberPrinter(3);
		
		//왼쪽 기계에서 번호표를 뽑아봅시다.
		numberPrinter1.printWaitNumber();
		//2번쨰
		numberPrinter1.printWaitNumber();
		//3번쨰
		numberPrinter1.printWaitNumber();
		
		//오른쪽 기계에서 번호표를 뽑아봅시다.
		numberPrinter2.printWaitNumber();
		//2번쨰
		numberPrinter2.printWaitNumber();
		//3번째
		numberPrinter2.printWaitNumber();
		
		
		//가운데
		numberPrinter3.printWaitNumber();
		numberPrinter3.printWaitNumber();
		numberPrinter3.printWaitNumber();
	}
	
	

}
