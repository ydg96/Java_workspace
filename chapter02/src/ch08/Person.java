package ch08;

public class Person {

	//인스턴스(객체)자기 자신의 메모리를 카리킨다.
	//생성자에서 또 다른 생성자를 호출할때 사용할 수 있다.
	//자신의 주소(참조값,주소값)을 반환 시킬 수 있다.
	
	String name;
	int age;
	String phoneNumber;
	//1.
	public Person(String name, int age) {
		this.name =name;
		this.age =age;
		System.out.println("생성자 1번 호출");
     }
	//2.
	public Person() {
		this("이름없음",1);
		System.out.println("생성자 2번 호출");
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
