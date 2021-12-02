package 복습2;

public class Person {


	String name;
	int age;
	
	public Person() {
		this("이름없음" ,1);
	
	}
	
	public Person(String name,int age) {
		this.name =name;
		this.age =age;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p =new Person();
		p.name = "James";
		p.age = 37;
		

		System.out.println(p);
		
	}

}
