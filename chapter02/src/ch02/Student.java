package ch02;

import java.util.Random;

public class Student{


public static void main(String[] args) {

	//객체의 속성은 멤버 변수로,객체의 기능은 메서드로 구현한다.
	
		 System.out.println("로또 숫자 여섯자리 + 보너스");
	     System.out.println(randomNuber());
	     System.out.println(randomNuber());
	     System.out.println(randomNuber());
	     System.out.println(randomNuber());
	     System.out.println(randomNuber());
	     System.out.println(randomNuber());
	     System.out.println("보너스");
	     System.out.println(randomNuber());
	}//end of main
	
	//함수 만들기
	
	public static int randomNuber() {
		int value;
		Random random = new Random();
		value = random.nextInt(45) + 1;//1 ~ 45까지 숫자중 하나를 반환
		return value;
		
	}
	
	
}