package ch01;

public class MainTest1 {

	public static void main(String[] args) {

		//문제 1.
		//Animal 타입으로 호랑이 생성
	    Animal tiger =new Tiger();
		//Animal 타입으로 독수리 생성
		Animal eagle =new Eagle();
		//Animal 타입으로 사람 생성
		Animal person =new Person();
		//문제 2.
		//Animal 타입으로 배열을 선언해 보세요.배열에 크기는 3
		Animal animal[]=new Animal[3];		
		//문제 3.
		//배열안에 값 넣기(호랑이,독수리,사람)
		animal[0]= tiger;
		animal[1]= eagle;
		animal[2]= person;
		//(tiger,eagle,person)move,hunt 메서드 호출
		//for문을 이용해서 만들어 봅시다.
		for(int i=0;i < animal.length; i++) {
			animal[i].move();
			animal[i].hunt();
			//컴파일 시점 ->hunt()
			//런타임 시점 ->hunt()
		}
		
	}

}
