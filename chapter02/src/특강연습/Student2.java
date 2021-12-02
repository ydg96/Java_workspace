package 특강연습;

public class Student2 extends Person {

	String name;
	int age;
	int height;
	int weight;
	
	public Student2() {
		name ="홍길동";
		age = 21;
		height =175;
		weight = 65;
		
	}
	public void showInfo() {
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("height:" + height);
		System.out.println("weight:" + weight);
	}
}
