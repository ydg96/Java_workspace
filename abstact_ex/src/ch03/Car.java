package ch03;

public abstract class Car {

	public void startCar() {
		System.out.println("�õ��� �̴ϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	//��ũ(hook)�޼���
	//�ʿ��ϸ� ����ϴ� Ŭ�������� ���� �����ؼ� ����϶�
	public void washCar() {
		
	}
	//�ٽ�!!!
	//���� Ŭ�������� ������ �� �� ���Ե�..
	final public void run() {
		//�޼��忡 ����(�ۺ��� ������ �� �ִ�.)
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
	
	
	
}
