package ch04;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���� ��ü 2 ����
		//����ö ��ü 2����
		//�л� ��ü 2����.
		Bus bus1 = new Bus(1);
		Bus bus2 = new Bus(2);
        Suway suway1 = new Suway(2);
		Student student1 = new Student("Ƽ��" , 10000);
		
	    student1.takeBus(bus1);
	    student1.showInfo();
	    bus1.showInfo();
	    System.out.println("------------");
	    student1.takeSubway(suway1);
	    student1.showInfo();
	    suway1.showInfo();
	    
	    //��ü�� ��ü���̿� ��ȣ�ۿ뿡 ���ؼ� ���α׷��� �� �� �ִ�.
	    
	    Bus bus3 = new Bus(3);
	    Bus bus4 = new Bus(4);
	    Suway suway2 = new Suway(2);
	    Suway suway3 = new Suway(3);
	    Student student2 = new Student("������", 10000);
	    Student student3 = new Student("�̳���", 10000);
	    
	    student2.takeBus(bus3);
	    student2.showInfo();
	    bus3.showInfo();
	    System.out.println("------------");
	    student2.takeSubway(suway2);
	    student2.showInfo();
	    suway2.showInfo();
	    System.out.println("-------------");
	    student3.takeBus(bus4);
	    student3.showInfo();
	    bus4.showInfo();
	    System.out.println("------------");
	    student3.takeSubway(suway3);
	    student3.showInfo();
	    suway3.showInfo();
	    		
	}

}
