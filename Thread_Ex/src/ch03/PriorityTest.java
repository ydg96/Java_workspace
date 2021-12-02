package ch03;

//Thread.MIN_PRIORITY(1)~Thread.MAX_PRIORITY(10)
//디폴트 우선순위:5
//우선 순위가 높은 thread가 cup의 배분을 받을 확률이 높다.
//setpriority(),getpriority()

class priorityThread extends Thread{
	@Override
	public void run() {

		int sum =0;
		Thread t =Thread.currentThread();
		
		System.out.println(t+"Start");
		for (int i = 0; i <100000; i++) {
			sum += i;
		}
		System.out.println(t.getPriority()+ "end");
	}
}

public class PriorityTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		//                  1~10 반복문
		/*for (i =Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++) {
			priorityThread pt =new priorityThread();
			//쓰레드에 우선순위를 지정하는 방법
			pt.setPriority(i);
			pt.start();*/
		
		
		priorityThread pt1 =new priorityThread();
		pt1.setPriority(1);
		priorityThread pt2 =new priorityThread();
		pt1.setPriority(5);
		priorityThread pt3 =new priorityThread();
		pt1.setPriority(10);
		}
	}


