package ch01;

import ch02.RemoteController;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Televison televison =new Televison();	
		Refrigerator refrigerator =new Refrigerator();
		ToyRobot robot =new ToyRobot();	
		
		televison.turnOn();
		televison.turnOff();
		System.out.println("-----------------------");
		refrigerator.turnOn();
		refrigerator.turnOff();
		System.out.println("------------------------");
		robot.turnOn();
		robot.turnOff();
		
		//다형성 - 배(선박,신체,과일)
		//배열만들어서 크기는 3개0,1,2,인스턴[3];
		RemoteController[]r1=new RemoteController[3];
	//	r1[0]= televison;
	//	r1[1]= refrigerator;
	//	r1[2]= robot;
		//문제1.확장 for문 이용해서 turnOn() 메서드 호출
		for(RemoteController remoteController:r1) {
			remoteController.turnOn();
		}
		System.out.println("--------------------");
		//문제2. 확장 for문 이용해서 turnOff() 메서드 호출
		for(RemoteController remoteController:r1) {
			remoteController.turnOff();
		}
		System.out.println("--------------------");
		//문제3. for문을 이용해서 클래스 타입이 ToyRobot 이면 name을 화면에 출력
		//instanceof 연산자,다운 캐스팅
		
		//1.for 문 만들기
		//2.만약 ToyRobt -> true{}
		//3.(int)0,8
		
		for(int i=0; i < r1.length; i++) {
			if(r1[i] instanceof ToyRobot) {
				String name = ((ToyRobot)r1[i]).name;
			System.out.println(name);
		}
		}
		//요구 사항 추가: 인터페이스 추가
		//냉장고에 문이 열렸으면 멜로디 소리를 나게하라.
		//장난감 로봇에 건전지가 거의 없으면 멜로디 소리를 나게하라
		
		//인터페이스 장점.
		//표준화가 가능 하다.
		//서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다.
		//클래스간에 결합도를 낮춰서 유연한 코드를 설계할 수 있다.
		
		//정리 
		//객체지향 패러다임 핵심
		//객체와 객체간에 상호 협력해서 코드를 설계해 나간다(버스,지하철,학생,스타그래프트)
		//객체와 객체간에 관계를 정의하여 코드를 설계해 나간다(상속,포함관계,추상클래스,인터페이스)
		//다형성(클래스를 다양한 형태로 바라본다)!!!

	
	
	}

}
