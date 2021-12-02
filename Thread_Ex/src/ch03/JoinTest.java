package ch03;

public class JoinTest extends Thread {
	int start;
	int end;
	int totla;

	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		int i;
		for (i = start; i < end; i++) {
			totla += i;

		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JoinTest jt1 =new JoinTest(1, 50);
		JoinTest jt2 =new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		//main �����尡 join ó��
		try {
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int lastTotal =jt1.totla + jt2.totla;
		
		System.out.println("jt1.total=" + jt1.totla);
		System.out.println("jt2.total=" + jt2.totla);
		System.out.println("lastTotal =" + lastTotal);
	}

}
