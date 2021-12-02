package ch09;

public class NumberPrinter {

	private int id;
	public static int waitNumber;//대기번호
	
	public NumberPrinter(int id) {
		// TODO Auto-generated constructor stub
	
		this.id =id;
		waitNumber =1;
		}

	//번호표를 찍어 주세요.
	public void ptintWaitNumber() {
		System.out.println(id + "기기의 대기 순번:" + waitNumber );
		waitNumber++;
	}
	
	
}
