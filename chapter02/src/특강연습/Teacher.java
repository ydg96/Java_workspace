package Ư������;

public class Teacher extends Person{

	String name;
	int age;
	int height;
	int weight;
	
	public Teacher() {
		name = "ȫ����";
		age = 40;
		height =180;
		weight =70;
		}
	
	public void showInfo() {
		System.out.println("name : "+ name);
		System.out.println("age : "+ age);
		System.out.println("height : "+ height);
		System.out.println("weight :"+ weight);
	}
}
