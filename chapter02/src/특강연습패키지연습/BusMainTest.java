package 특강연습패키지연습;

public class BusMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bus bus1 = new Bus(133);
		Bus bus2 = new Bus(200);
		
		bus1.take(1000);
		bus1.take(1000);
		bus1.take(1000);
		
		bus1.showInfo();
		
		bus2.take(1500);
		bus2.take(1500);
		
		bus2.showInfo();
		
	}

}
