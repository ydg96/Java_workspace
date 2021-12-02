package ch01;

public class ThreadTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Thread 란
		//process: 프로그램이 실행되면 OS로 부터 메모리를 할당받아서 프로세스 상태가 된다.
		//thread : 하나의 프로세스는 하나 이상의 thread를 가지게 되고,실제 작업을 수행하는 단위 입니다.
		
		//multi-threading
		//여러 thread가 동시에 수행되는 프로그램을 만들때,여러 작업이 동시에 실행되는 효과를 만들어 냅니다.
		
		//thread는 각각 자신만의 작업공간을 가진다.(context)
		
		//thread사이에서 공유하는 자원을 가질수 있습니다.
		//여러 thread가 자원을 공유하여 작업이 수행되는 경우 서로 자원을 차지하려는 race condition이 발생할 수 있다.
		//(의도하지 않는 결과를 생성할 수 있다)
		
		//이렇게 여러 thread가 공유하는 자원중 경쟁이 발생하는 부문을 critical section이라고 합니다(임계 영역)
		//동기화 작업 해주어야 합니다(일중에 순차적 수행),,구현하지 않으면 오류가 발생할 수 있습니다.
		
		
	}

}
