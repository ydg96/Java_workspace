package Ư������;

public class Student1 {

	// ������ - constructor
	// ��ü�� �����Ҷ� ������ ���� ������� ������� �����ϴ°�
	// ��ü�� �����Ҷ� �������� �ο��ϴ� ��
	int number; // �̷��͵��� �������.
	String name;
	int grade;

	// ������ ����(�����ڰ� ���� ����)
	public Student1(int number, String name, int grade) {
		// this�� �ڱ� �ڽ��� ����Ų��.(�ڱ� �ڽ��� �ּҰ�)
		this.number = number;
		this.name = name;
		this.grade = grade;

		// ��üȭ(�ν��Ͻ�) �ɋ� �����ڴ� ���� ó�� �����ϴ� �ڵ��̴�.
	    System.out.println("��ü�� ���� �մϴ�.");
		//showInfo();
	}

	//�����ڰ� ���� �����ڸ� ������ ������
	//�⺻������ �����Ϸ��� �⺻ �����ڸ� ����� �ش�.
	public Student1() {
		
	}
	
	// �޼���(����Ÿ�� String (�ڿ��� �ҹ��ڷ� ����)
	public String showInfo() {
		return name + "�л��� �й���" + number + "�̰�" + grade + "�Դϴ�.";
	}

}
