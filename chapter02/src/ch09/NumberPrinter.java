package ch09;

public class NumberPrinter {

	private int id;
	public static int waitNumber;//����ȣ
	
	public NumberPrinter(int id) {
		// TODO Auto-generated constructor stub
	
		this.id =id;
		waitNumber =1;
		}

	//��ȣǥ�� ��� �ּ���.
	public void ptintWaitNumber() {
		System.out.println(id + "����� ��� ����:" + waitNumber );
		waitNumber++;
	}
	
	
}
