package ch10;

public class MainTset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//메서드오버 로딩
		Zealot zealot1=new Zealot("질럿1");
		Zealot zealot2=new Zealot("질럿2");
		Zealot zealot3=new Zealot("질럿3");
		
		Marine marine1=new Marine("마린1");
		Marine marine2=new Marine("마린2");
		Marine marine3=new Marine("마린3");
		
		Zergling zergling1=new Zergling("저글링1");
		Zergling zergling2=new Zergling("저글링2");
		Zergling zergling3=new Zergling("저글링3");
		
		marine1.attack(zealot1);
		marine1.attack(zergling1);
		
		System.out.println("안녕하세요.");
		System.out.println(1);
		System.out.println(0.5);
		System.out.println('A');
		
	}

}
