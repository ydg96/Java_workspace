package ch10;

public class NumberPrinter {

	private int id;
//	pivate int waitNumber;
	private static int waitNumber;
	
	public NumberPrinter(int id) {
		this.id = id;
		waitNumber =1;
	}
	
	//번호표를 찍어주세요.
	public void printWaitNumber() {
		System.out.println(id + "기기의 대기 순번:" + waitNumber);
		waitNumber++;
	}
	
}
