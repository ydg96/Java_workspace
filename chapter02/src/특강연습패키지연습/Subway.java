package 특강연습패키지연습;

public class Subway {

	//호선번호 
	int sNumber;
	//승객수
	int sp;
	//수입금
	int money;
	
	//생성자 - 호선번호를 받을 수 있게 만들어 주세요.
	public Subway(int sNumber) {
		this.sNumber = sNumber;
	}
	
	//take 메서드정의	
	//리턴값 viod
	//매개 변수 int money
	public void take(int money) {
		this.money += money;
		sp++;
	}
	
	//showInfo 매서드 만들어 주세요.
	public void showInfo(){
		System.out.println(sNumber+"호선의 승객은");
		System.out.println(sp +"명이고");
		System.out.println("수입금은 :"+this.money + "입니다.");
		
		
	}
	
}
