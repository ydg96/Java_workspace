package ch01;

public abstract class Animal {

	//�߻� Ŭ����(abstract class)
	//�ϳ� �̻��� �߻� �޼��带 �����ϴ� Ŭ���� �Դϴ�.
	
	public String name; //�������
	
	//�Ϲ� �޼���
	public void move() {
		System.out.println("�̵� �մϴ�.");
		
	}
	
	//�߻� �޼���
	public abstract void hunt();
	
	//�����Լ�
	public static void main(String[] args) {
		//�߻� Ŭ������ �Ϲ������� ����ߴ� new Ű���带 ����ؼ� ��ü�� ���� �� ����.
		//new Animal();
	}
	
	
	
	
	
}
