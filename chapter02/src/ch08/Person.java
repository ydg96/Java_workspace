package ch08;

public class Person {

	//�ν��Ͻ�(��ü)�ڱ� �ڽ��� �޸𸮸� ī��Ų��.
	//�����ڿ��� �� �ٸ� �����ڸ� ȣ���Ҷ� ����� �� �ִ�.
	//�ڽ��� �ּ�(������,�ּҰ�)�� ��ȯ ��ų �� �ִ�.
	
	String name;
	int age;
	String phoneNumber;
	//1.
	public Person(String name, int age) {
		this.name =name;
		this.age =age;
		System.out.println("������ 1�� ȣ��");
     }
	//2.
	public Person() {
		this("�̸�����",1);
		System.out.println("������ 2�� ȣ��");
	}
    
	public Person(String name, int age,String phoneNumber) {
		//this.name = name;
		//this.age =age;
		this(name,age);
		this.phoneNumber =phoneNumber;
	}

	//3.
	public Person getPerson() {
		return this;
	}
}
