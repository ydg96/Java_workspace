package ch03;

public class Person {

	int height;
	int weight;
	String sex;
	String name;
	int age;
	
	
	public Person(int height, int weight, String sex, String name, int age) {
		super();
		this.height = height;
		this.weight = weight;
		this.sex = sex;
		this.name = name;
		this.age = age;
	}
	public void showInfo() {
		System.out.println("Ű��" + this.height + "�̰�" + "�����԰�" + this.weight + "ų���� ������ �ֽ��ϴ�" + "�̸���" + this.name + "�̰� ���̴�" + this.age + "�� �Դϴ�.");
	}
	
	public static void main(String[] args) {
	

		Person person = new Person(180 , 78 , "����" , "�丶��" ,37);
		person.showInfo();
		
		
		
		
	
	
	}
}