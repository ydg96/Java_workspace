package ch03;

//Thread.MIN_PRIORITY(1)~Thread.MAX_PRIORITY(10)
//����Ʈ �켱����:5
//�켱 ������ ���� thread�� cup�� ����� ���� Ȯ���� ����.
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
		//                  1~10 �ݺ���
		/*for (i =Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++) {
			priorityThread pt =new priorityThread();
			//�����忡 �켱������ �����ϴ� ���
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


