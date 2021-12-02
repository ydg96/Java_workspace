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
		System.out.println("키가" + this.height + "이고" + "몸무게가" + this.weight + "킬로인 남성이 있습니다" + "이름은" + this.name + "이고 나이는" + this.age + "세 입니다.");
	}
	
	public static void main(String[] args) {
	

		Person person = new Person(180 , 78 , "남성" , "토마스" ,37);
		person.showInfo();
		
		
		
		
	
	
	}
}