package ch10;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberPrinter numberPrinter1 =new NumberPrinter(1);
		NumberPrinter numberPrinter2 =new NumberPrinter(2);
		NumberPrinter numberPrinter3 =new NumberPrinter(3);
		
		//���� ��迡�� ��ȣǥ�� �̾ƺ��ô�.
		numberPrinter1.printWaitNumber();
		//2����
		numberPrinter1.printWaitNumber();
		//3����
		numberPrinter1.printWaitNumber();
		
		//������ ��迡�� ��ȣǥ�� �̾ƺ��ô�.
		numberPrinter2.printWaitNumber();
		//2����
		numberPrinter2.printWaitNumber();
		//3��°
		numberPrinter2.printWaitNumber();
		
		
		//���
		numberPrinter3.printWaitNumber();
		numberPrinter3.printWaitNumber();
		numberPrinter3.printWaitNumber();
	}
	
	

}
