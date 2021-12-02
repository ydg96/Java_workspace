package ch03;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc calc =new CompleteCalc();
		
		int num1 =10;
		int num2 =2;
		
		System.out.println(num1 + "+" + num2 + "=" + calc.add(num1, num2));
		System.out.println(num1 + "-" + num2 + "=" + calc.substract(num1, num2));
		System.out.println(num1 + "*" + num2 + "=" + calc.times(num1, num2));
		System.out.println(num1 + "/" + num2 + "=" + calc.divide(num1, num2));
		
		//showInfo
		//¹®Á¦1.
		//(int)0.11;
		//((CompleteCalc).showInfo();
		//
		calc.showInfo();
		
		
		
	}

}
