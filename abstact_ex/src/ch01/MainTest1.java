package ch01;

public class MainTest1 {

	public static void main(String[] args) {

		//���� 1.
		//Animal Ÿ������ ȣ���� ����
	    Animal tiger =new Tiger();
		//Animal Ÿ������ ������ ����
		Animal eagle =new Eagle();
		//Animal Ÿ������ ��� ����
		Animal person =new Person();
		//���� 2.
		//Animal Ÿ������ �迭�� ������ ������.�迭�� ũ��� 3
		Animal animal[]=new Animal[3];		
		//���� 3.
		//�迭�ȿ� �� �ֱ�(ȣ����,������,���)
		animal[0]= tiger;
		animal[1]= eagle;
		animal[2]= person;
		//(tiger,eagle,person)move,hunt �޼��� ȣ��
		//for���� �̿��ؼ� ����� ���ô�.
		for(int i=0;i < animal.length; i++) {
			animal[i].move();
			animal[i].hunt();
			//������ ���� ->hunt()
			//��Ÿ�� ���� ->hunt()
		}
		
	}

}
