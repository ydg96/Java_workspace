package ch06;

public class CarMAinTest {

	public static void main(String[] args) {
		
		Car car =new Car("���׽ý�",5000);
		car.showInfo();
		
		System.out.println(car.engine.name);
		System.out.println(car.engine.price);
		System.out.println(car.engine);
	}

}
