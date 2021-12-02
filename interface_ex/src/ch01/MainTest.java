package ch01;

import ch02.RemoteController;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Televison televison =new Televison();	
		Refrigerator refrigerator =new Refrigerator();
		ToyRobot robot =new ToyRobot();	
		
		televison.turnOn();
		televison.turnOff();
		System.out.println("-----------------------");
		refrigerator.turnOn();
		refrigerator.turnOff();
		System.out.println("------------------------");
		robot.turnOn();
		robot.turnOff();
		
		//������ - ��(����,��ü,����)
		//�迭���� ũ��� 3��0,1,2,�ν���[3];
		RemoteController[]r1=new RemoteController[3];
	//	r1[0]= televison;
	//	r1[1]= refrigerator;
	//	r1[2]= robot;
		//����1.Ȯ�� for�� �̿��ؼ� turnOn() �޼��� ȣ��
		for(RemoteController remoteController:r1) {
			remoteController.turnOn();
		}
		System.out.println("--------------------");
		//����2. Ȯ�� for�� �̿��ؼ� turnOff() �޼��� ȣ��
		for(RemoteController remoteController:r1) {
			remoteController.turnOff();
		}
		System.out.println("--------------------");
		//����3. for���� �̿��ؼ� Ŭ���� Ÿ���� ToyRobot �̸� name�� ȭ�鿡 ���
		//instanceof ������,�ٿ� ĳ����
		
		//1.for �� �����
		//2.���� ToyRobt -> true{}
		//3.(int)0,8
		
		for(int i=0; i < r1.length; i++) {
			if(r1[i] instanceof ToyRobot) {
				String name = ((ToyRobot)r1[i]).name;
			System.out.println(name);
		}
		}
		//�䱸 ���� �߰�: �������̽� �߰�
		//����� ���� �������� ��ε� �Ҹ��� �����϶�.
		//�峭�� �κ��� �������� ���� ������ ��ε� �Ҹ��� �����϶�
		
		//�������̽� ����.
		//ǥ��ȭ�� ���� �ϴ�.
		//���� ������� Ŭ�����鿡�� ���踦 �ξ� �� �� �ִ�.
		//Ŭ�������� ���յ��� ���缭 ������ �ڵ带 ������ �� �ִ�.
		
		//���� 
		//��ü���� �з����� �ٽ�
		//��ü�� ��ü���� ��ȣ �����ؼ� �ڵ带 ������ ������(����,����ö,�л�,��Ÿ�׷���Ʈ)
		//��ü�� ��ü���� ���踦 �����Ͽ� �ڵ带 ������ ������(���,���԰���,�߻�Ŭ����,�������̽�)
		//������(Ŭ������ �پ��� ���·� �ٶ󺻴�)!!!

	
	
	}

}
