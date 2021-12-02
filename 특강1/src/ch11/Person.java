package ch11;

public class Person {

	//this 란 3가지 사용법만 알면 충분합니다.
	//1.인스턴스 (객체)자신의 메모리 주소를 가리킨다.
	//2.생성자에서 또 다른 생성자를 호출할때 사용할 수 있다.
	//3.자신의주소 (참조값,주소값)을 반환 시킬 수 있다.
	
	String name;
	int age;
	
	public Person(String name,int age) {
		//1.자기 자신을 가리키는 this
		this.name = name;
		this.age = age;
	}
	//요청 -> 기본 생성자를 만들수 있게 허용해 주세요.
	public Person() {
		//즉 사용하는 입장에서 -> new Person();
		//2.생성자에서 또 다른 생성자를 호출할떄 사용할 수 있다.
		this("이름없음" , 1);
	}
	//3.자신의 주소(참조값)을 반환할 수 있다.
	public Person getperson() {
		return this;
	}
	
	public void showInfo() {
		System.out.println("이름:" + name + "나이:" + age );
	}
	//메인함수 바로생성 가능
	public static void main(String[] args) {
		Person person = new Person();
		person.showInfo();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
