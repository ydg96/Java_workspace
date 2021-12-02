package 연습1;

public class for예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int sum = 2;
//		for(int i = 1; i <= 9; i++) {
//			
//		
//		System.out.println(sum + "*" + i + "=" + (sum*i));
//		
//	    
//	}
//	for(int i = 1; i < 11; i++) {
//		System.out.println(i);
//		if(i % 7 ==0) {
//			break;
//		}
//	}
//	
//	for(int i=2; i < 9; i++) {
//		System.out.println(i);
//		if(i + 2  0) {
//			break;
//		}
//	}
//	
	int num;
	for(num =1; num <= 100; num++){
		if ((num % 3) != 0){
			continue;
		}
		System.out.println(num);
	}
	
	
	
	}
}
