package ch10;

public class NumberPrinter {

	private int id;
//	pivate int waitNumber;
	private static int waitNumber;
	
	public NumberPrinter(int id) {
		this.id = id;
		waitNumber =1;
	}
	
	//��ȣǥ�� ����ּ���.
	public void printWaitNumber() {
		System.out.println(id + "����� ��� ����:" + waitNumber);
		waitNumber++;
	}
	
}
