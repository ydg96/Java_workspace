package ch07;

public class BankMAinTest {

	public static void main(String[] args) {
	Bank bank = new Bank();
	bank.deposit(10_000);
	bank.showInfo();
	bank.whitdraw(5_000);
	bank.showInfo();
	
	//���� �����ڰ� �Ǽ��� ��������� �ٷ� �����ؼ� �ܾ��� ������
	
	//ank.balance = 1_000_000;
	bank.showInfo();
	
	//���� ���� ������
	//4����
	//public - ������ ������ ����ϰ� �Ѵ�.
	//default - ���� ��Ű�� �������� ������ ����Ѵ�.
	//protected - ��Ӱ��迡�� ������ ��� �Ѵ�.
	//private - ���� Ŭ���� �������� ������ ��� �Ѵ�.
	
	}

}
