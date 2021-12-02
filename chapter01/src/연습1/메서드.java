package 연습1;

public class 메서드 {

	public static int addNum(int n1, int n2) {
		
		int result;
		result = n1+ n2;
		return result;				
	}

	public static void sayHello(String greeting) {
		System.out.println(greeting);
}
public static int calcsum(){
	return 0;
		
		
}
		
		

		public static void main(String[] args) {
			
			int num1 = 10;
			int num2 = 20;
			
			int total = addNum(num1, num2);
			
			sayHello("안녕하세요");
			int sum = calcsum();
			
			System.out.println(total);
			System.out.println(sum);
	



}

}