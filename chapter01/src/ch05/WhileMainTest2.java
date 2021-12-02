package ch05;

public class WhileMainTest2 {

	public static void main(String[] args) {
	
		
		//1부터 10까지 더해서 결과값을 출력
		int num=1;
		int snm=0;//<-결과값 담기
		final int LIMIT_VALUE =10;
		
		//while 문을 사용해서 1퉈 10까지 덤셈 결과를 출력해 보세요.
		 
		while (num <= LIMIT_VALUE) {
			snm=snm + num;
			num = num +1;
			//num++
		}
        System.out.println("결과값:"+snm);
	}

}
