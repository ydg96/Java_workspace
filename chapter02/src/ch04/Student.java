package ch04;

public class Student {

	String name;
	int money;
	
	public Student(String name, int money) {
		// TODO Auto-generated constructor stub
	this.name = name;
	this.money = money;
	}
	
	//����â �����ֱ�
	public void showInfo() {
		// TODO Auto-generated constructor stub
       System.out.println(name + " ���� ���� ����:" + money);
       
	}
	//�л��� ������ ź��.
	public void takeBus(Bus bus) {
		bus.take(1000);
		//this.money = this.money = 1000;
		this.money -= 1000;
	}
	//�л��� ����ö�� ź��.
	public void takeSubway(Suway suway) {
		suway.take(1200);
		this.money -= 1200;
	}
}
