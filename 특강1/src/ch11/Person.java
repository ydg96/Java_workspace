package ch11;

public class Person {

	//this �� 3���� ������ �˸� ����մϴ�.
	//1.�ν��Ͻ� (��ü)�ڽ��� �޸� �ּҸ� ����Ų��.
	//2.�����ڿ��� �� �ٸ� �����ڸ� ȣ���Ҷ� ����� �� �ִ�.
	//3.�ڽ����ּ� (������,�ּҰ�)�� ��ȯ ��ų �� �ִ�.
	
	String name;
	int age;
	
	public Person(String name,int age) {
		//1.�ڱ� �ڽ��� ����Ű�� this
		this.name = name;
		this.age = age;
	}
	//��û -> �⺻ �����ڸ� ����� �ְ� ����� �ּ���.
	public Person() {
		//�� ����ϴ� ���忡�� -> new Person();
		//2.�����ڿ��� �� �ٸ� �����ڸ� ȣ���ҋ� ����� �� �ִ�.
		this("�̸�����" , 1);
	}
	//3.�ڽ��� �ּ�(������)�� ��ȯ�� �� �ִ�.
	public Person getperson() {
		return this;
	}
	
	public void showInfo() {
		System.out.println("�̸�:" + name + "����:" + age );
	}
	//�����Լ� �ٷλ��� ����
	public static void main(String[] args) {
		Person person = new Person();
		person.showInfo();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
