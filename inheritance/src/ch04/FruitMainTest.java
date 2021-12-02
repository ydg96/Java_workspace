package ch04;

import java.util.Iterator;

public class FruitMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Peach peach = new Peach();
		Banana banana = new Banana();
		
		peach.showInfo();
		banana.showInfo();
		
		//������ - Ŭ������ �پ��� ���·� �ٶ󺻴�.(��)
		//�ϳ��� �ڵ尡 ���� �ڷ������� �����Ǿ� ����Ǵ� ��
		//���� �ڵ忡�� ���� �ٸ� ���� ����� ���ü��� �ִ�.
		//���� ����,��Ӱ� ���Ҿ� ��ü���� ���α׷����� ���� ū Ư¡ �� �ϳ���.
		//�������� �� Ȱ���ϸ� �����ϰ� Ȯ�强 �ְ�,���������� ���� ���α׷��� ����� �ִ�.
		
		System.out.println("-------------------------");
		//�ϳ��� ������ �������� ������ ������ �ڷ����� ��´�.
		Fruit[]basket = new Fruit[4];
		basket[0] =new Banana();
		basket[1] =new Peach();
		basket[2] =new Banana();
		basket[3] =new Peach();
		
		//�ڵ����� - ������ Ÿ��(Ÿ�� ������ Ȯ�� ����)
		//�� Ÿ�� - ���α׷� ����� ���� ����
		
		//.�����ڸ� ����ϰ� �Ǹ� ��ü�� Ÿ�Ա����� Ȯ�� �����մϴ�.
		//origin ��� ������ �����ϱ� ���ؼ��� �ٿ� ĳ������ �ؾ� �Ѵ�.
		
		String temp = ((Banana)basket[0]).origin;
		System.out.println("������ : " + temp);
		//instanceof ������
		if(basket[0]instanceof Banana){
			System.out.println("�ٳ��� Ÿ�� �Դϴ�.");
		}else {
			System.out.println("������ �Դϴ�.");
		}
        if(basket[1]instanceof Peach){
        	System.out.println("������ Ÿ�� �Դϴ�.");
        }
		
        //����1.for���� ����ؼ� �ٳ��� Ÿ���� ��� ȭ�鿡 origin ������ ���
        for (int i = 0; i < basket.length; i++) {
			basket[i].showInfo();
			if(basket[i]instanceof Banana){
				String origin = ((Banana)basket[i]).origin;
				System.out.println("������ : " + origin);
			}
		}
			
		
			
		}
	}


