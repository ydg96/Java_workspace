package Ư��������Ű������;

public class BankMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank();
		//��� ������ , ���� ����
		//int :0
		//double :0.0
		//string : null
		//student : null
		//System.out.println(bank.balance);
	
	    //�Ա��մϴ�.
		bank.deposit(10_000);
		bank.showInfo();
		//����մϴ�.
		bank.withdraw(5_000);
		bank.showInfo();
	
		//������ �Ǽ��� ��� ������ �ٷ� �����ؼ� �ܾ��� ������.
		//bank.balance = 1_000_000;
		bank.showInfo();
		
		//���� ���� ������
		//4����
		//public-������ ������ ����ϰ� �Ѵ�.
		//default - ���� ��Ű�� �������� ������ ����Ѵ�.
		//protected - �����迡�� ������ ����Ѵ�.
		//private - ���� Ŭ���� �������� ������ ����Ѵ�.
	//getter	
	System.out.println(-1000);
	bank.showInfo();
	
	}//end of main
	

}
