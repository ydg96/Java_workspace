package 연습1;

public class 연습25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//예약어 continue
		//무시하고 진행하는 continue
		
		int sum;
		int count =0;
		final int MULTIPLE =1000;
		
		for(sum = 1; sum <= MULTIPLE; sum++) {
			
			//3에 배수이면 출력하지 마시오.
			if(sum % 3 == 0){
				count++;
				continue;
		}
		System.out.println("출력값: " + sum);
		}
		
		System.out.println("출력값:" + count);
		
		
	}

}
