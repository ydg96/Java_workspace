package ch02;

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("화면에 표시 됩니다.");
		
	}

	@Override
	public void typing() {
		System.out.println("키보드로 타이핑 합니다.");
		
	}
	

}
