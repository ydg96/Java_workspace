package ch01;

public class ThreadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 30; i++) {
			System.out.println("-");
			try {
				Thread.sleep(200);
			}catch(Exception e) {
				
			}
			
		}
	}

}
