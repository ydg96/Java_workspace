package ch03;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car aiCar =new AICar();
		aiCar.run();
		System.out.println("-----------------------");
		
		Car manualCar =new ManualCar();
		manualCar.run();
	}

}
