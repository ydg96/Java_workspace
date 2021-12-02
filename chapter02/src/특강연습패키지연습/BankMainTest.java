package 특강연습패키지연습;

public class BankMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank();
		//멤버 변수와 , 지역 변수
		//int :0
		//double :0.0
		//string : null
		//student : null
		//System.out.println(bank.balance);
	
	    //입금합니다.
		bank.deposit(10_000);
		bank.showInfo();
		//출금합니다.
		bank.withdraw(5_000);
		bank.showInfo();
	
		//신입이 실수로 멤버 변수에 바로 접근해서 잔액을 수정함.
		//bank.balance = 1_000_000;
		bank.showInfo();
		
		//접근 제어 지시자
		//4가지
		//public-누구나 접근을 허용하게 한다.
		//default - 같은 패키지 내에서는 접근을 허용한다.
		//protected - 상곧관계에서 접근을 허용한다.
		//private - 같은 클래스 내에서만 접근을 허용한다.
	//getter	
	System.out.println(-1000);
	bank.showInfo();
	
	}//end of main
	

}
