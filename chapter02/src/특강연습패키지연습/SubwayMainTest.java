package 특강연습패키지연습;

public class SubwayMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subway subway1 = new Subway(2);
		Subway subway2 = new Subway(5);
		
		subway1.take(1200);
		subway1.take(1500);
		subway1.take(1100);
		subway1.showInfo();
	}

}
