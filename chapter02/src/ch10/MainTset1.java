package ch10;

public class MainTset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�޼������ �ε�
		Zealot zealot1=new Zealot("����1");
		Zealot zealot2=new Zealot("����2");
		Zealot zealot3=new Zealot("����3");
		
		Marine marine1=new Marine("����1");
		Marine marine2=new Marine("����2");
		Marine marine3=new Marine("����3");
		
		Zergling zergling1=new Zergling("���۸�1");
		Zergling zergling2=new Zergling("���۸�2");
		Zergling zergling3=new Zergling("���۸�3");
		
		marine1.attack(zealot1);
		marine1.attack(zergling1);
		
		System.out.println("�ȳ��ϼ���.");
		System.out.println(1);
		System.out.println(0.5);
		System.out.println('A');
		
	}

}
