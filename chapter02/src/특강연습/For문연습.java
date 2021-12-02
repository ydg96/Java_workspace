package 특강연습;

public class For문연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int num = 0;
		//for(int i =0 ; i <= 5; i++) {
		//	num += i;
		//	System.out.println(num);
		//}
		
	//	int sum =2;
		//for(int i =2; i <=9; i++){
		//	System.out.println(sum + "*" + i + "=" + (sum*i));
	//	}
		
	//	int n1= 1;
	//	for(int i =1; i <11; i++) {
	//		System.out.println(i);
	//		if(i % 7 ==0) {
	//			break;
	//		}
	//	}	
		
		int num;
		for(num =1; num <=100; num++) {
			if((num % 3)!= 0) {
				continue;
			}
		}
		System.out.println(num);
	}
}
