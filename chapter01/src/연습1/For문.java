package 연습1;

public class For문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//화면에 구구단 2단을 출력해 봅시다.
		
		int num=2;
		System.out.println(num +" *1 " +(num *1));
		System.out.println(num +" *2 " +(num *2));
		System.out.println(num +" *3 " +(num *3));
		System.out.println(num +" *4 " +(num *4));
		System.out.println(num +" *5 " +(num *5));
		System.out.println(num +" *6 " +(num *6));
		System.out.println(num +" *7 " +(num *7));
		System.out.println(num +" *8 " +(num *8));
		System.out.println(num +" *9 " +(num *9));
		
		//3단을 출력해보세요.
		
		num=3;
		System.out.println(num +" *1 " +(num *1));
		System.out.println(num +" *2 " +(num *2));
		System.out.println(num +" *3 " +(num *3));
		System.out.println(num +" *4 " +(num *4));
		System.out.println(num +" *5 " +(num *5));
		System.out.println(num +" *6 " +(num *6));
		System.out.println(num +" *7 " +(num *7));
		System.out.println(num +" *8 " +(num *8));
		System.out.println(num +" *9 " +(num *9));
		
		//for 문을 이용해서 구구단 5단을 출력해 봅시다.
		
		num=5;
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
			
		}
		
		num=6;
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		
		num=7;
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
	}
		
		num=8;
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		
		num=9;
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
		
	
	
	
	
	
	
	
	}

}
