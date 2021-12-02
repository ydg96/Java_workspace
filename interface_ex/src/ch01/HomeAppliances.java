package ch01;
//HomeAppliances 클래스를 직접 new 해서 사용할 필요
//없기 떄문에 추상 클래스로 만들어 줄수 있다.
public abstract class HomeAppliances {
	
	
	int widh;
	int height;
	String color;
	
	public abstract void turnOn();
	
	public abstract void turnOff();
	
	
	
	
	
}
