package ch02;
//�۾��ڵ��� �ڿ�(������)�� �����ϴ� ��Ȳ�� �� ó�� �ϴ� ���
class BankAccount{
	
	private int money=100_000;
	
	//gettet
	public int getMoney() {
		return this.money;
	}
	public void setMoney(int money) {
		this.money =money;
	}
	//�Աݱ��
	public void saveMoney(int money) {
		synchronized (this) {
		//10���� ����
		int currentMoney =getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setMoney(currentMoney + money);
		System.out.println("�Ա� �� ���� �ܾ�:" + getMoney());
	}
	}
	//��ݱ��
	public synchronized void widthdrawMoney(int money) {
		//10���� ����
		int currentMoney =getMoney();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//����� �ڵ�
		if(currentMoney >= money) {
		setMoney(currentMoney - money);
		System.out.println("����� ���� �ܾ�:" + getMoney());
	}else {
		System.out.println("�߸��� �Է� �Դϴ�.");
		}
	}
	
}//end of class

//�ƹ��� Ŭ����
class Father extends Thread{
	BankAccount account;
	
	public Father(BankAccount account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//�Ա��ϱ�
		account.saveMoney(10_000);		
	}
}
//��Ӵ�
class Mother extends Thread{
	BankAccount account;
	
	public Mother(BankAccount account) {
		this.account =account;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//����ϱ�
		account.widthdrawMoney(5_000);
	}
}





public class SharedResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���� 10������ ���� �Ǿ� �ִ� ���·� ��ü ����
		BankAccount account =new BankAccount();
		Father father =new Father(account);
		Mother mother =new Mother(account);
		
		//�ƹ����� �Ա��ϴ� ����
		father.start();
		//��Ӵϰ� ����ϴ� ����
		mother.start();
		//���� ó�� �ݾ� : 10���� + 1���� -5õ�� = 10�� 5õ��
		//�����:110000?(�ǵ�ġ ���� ���)
		//�Ӱ� ������ ���� (�۾��ڰ��� �ڿ��� �����ϴ� ����)
		//�ٸ� �۾��ڰ� ������� ���ϵ��� Lock �ɾ� �ش�.
		//�ϴ� ��� - ����ȭ ó���� �Ѵ�(Synchronization)
		//1.Synchronization �޼��带 ����ϴ� ���
		//2.Synchronization ���� ����ϴ� ���
		
		
		
	}

}
