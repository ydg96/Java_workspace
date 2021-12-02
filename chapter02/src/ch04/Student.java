package ch04;

public class Student {

	String name;
	int money;
	
	public Student(String name, int money) {
		// TODO Auto-generated constructor stub
	this.name = name;
	this.money = money;
	}
	
	//정보창 보여주기
	public void showInfo() {
		// TODO Auto-generated constructor stub
       System.out.println(name + " 님의 남은 돈은:" + money);
       
	}
	//학생이 버스를 탄다.
	public void takeBus(Bus bus) {
		bus.take(1000);
		//this.money = this.money = 1000;
		this.money -= 1000;
	}
	//학생이 지하철을 탄다.
	public void takeSubway(Suway suway) {
		suway.take(1200);
		this.money -= 1200;
	}
}
