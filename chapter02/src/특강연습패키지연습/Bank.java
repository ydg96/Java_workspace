package Ư��������Ű������;

public class Bank {

	//���� ����
	private int balance;
	
	//�Ա�
	public void deposit(int money) {
		this.balance += money;
	}
	//���
	public void withdraw(int money) {
		this.balance -= money;
	}
	public void showInfo() {
		System.out.println("���� �ܾ���:" + this.balance + "�Դϴ�.");
	
	}

	//private�� ������ ��� ������ �ܺο��� �ٷ� �����ؼ� Ȯ�� �Ҽ� ���� ������
	//�Ϲ������� get()�޼��带 ���� �ܺο��� Ȯ���� �� �ֵ��� �Ѵ�,
	//read only
	public int getBalance() {
		return this.balance;
	}

	//�ݴ�� ��� ������ ���� ������ �ִ� ����� ����� �ʹٸ�
	//�Ϲ������� set()�޼��带 �����ؼ� �ܺϿ��� ������ �� �ֵ�� �����Ѵ�.
	public void setBalance(int balance) {
		//����� �ڵ�
		if(balance < 0) {
			System.out.println("�߸��� �Է� �Դϴ�.");
		}else {
			this.balance = balance;
		}
		
	}
	





}
