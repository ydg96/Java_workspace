package ch09;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static �¾� ->��ü ������ ��� ���� �̸� �Ҵ� �Ǿ��ִ�.
		System.out.println(NumberPrinter.waitNumber);
		NumberPrinter numberPrinter1 = new NumberPrinter(1);
		NumberPrinter numberPrinter2 = new NumberPrinter(2);
		//���� ���
		//1.��ȣǥ�� ����
		numberPrinter1.ptintWaitNumber();
		//2.'''
		numberPrinter1.ptintWaitNumber();
		numberPrinter1.ptintWaitNumber();
		numberPrinter1.ptintWaitNumber();

		
		//������ ���
		numberPrinter2.ptintWaitNumber();
		numberPrinter2.ptintWaitNumber();
		numberPrinter2.ptintWaitNumber();
		numberPrinter2.ptintWaitNumber();
		numberPrinter2.ptintWaitNumber();
		
		
		
		
		
	}

}
