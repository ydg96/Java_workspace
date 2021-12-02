package Ư������;

public class FruitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Peach peach = new Peach();
		Banana banana = new Banana();

		peach.showInfo();
		banana.showInfo();

		// ���⼺ - Ŭ������ �پ��� ���·� �ٶ󺻴�(��)
		// �ϳ��� �ڵ尡 ���� �ڷ������� �����Ǿ� ����Ǵ� ��
		// ���� �ڵ忡�� ���� �ٸ� ���� ����� ����
		// ���� ����,��Ӱ� ���Ҿ� ��ü���� ���α׷����� ���� ū Ư¡ �� �ϳ���
		// ���⼺�� �� Ȱ���ϸ� �����ϰ� Ȯ�强�ְ�,���������� ���� ���α׷��� ����� ����.

		System.out.println("----------------");
		Fruit[] basket = new Fruit[4];
		basket[0] = new Banana();
		basket[1] = new Peach();
		basket[3] = new Banana();
		basket[4] = new Peach();

		// �Ӹ��ӿ� �� �־� �ӽô�.
		// �ڵ� ���� - ������ Ÿ��(Ÿ�Ա����� Ȯ�� ����)
		// ���α׷� ����� ���� ���� -�� Ÿ��

		// .�����ڸ� ����ϰ� �Ǹ� ��ü�� Ÿ�Ա����� Ȯ�� �����մϴ�.
		// origin ��� ������ �����ϱ� ���ؼ� �ٿ� ĳ������ �ؾ� �Ѵ�.
		// ((Banana)basket[0]).origin

		// instanceof ������
		if (basket[0] instanceof Banana) {
			System.out.println("�ٳ��� Ÿ�� �Դϴ�.");
		}
		if (basket[1] instanceof Peach) {
			System.out.println("������ Ÿ�� �Դϴ�.");
		}

		// 1.���� for���� ����ؼ� �ٳ��� Ÿ���� ���
		// ȭ�鿡 origin
		//for (int i = 0; i < basket.length; i++) {
			//basket[i].showInfo();
		//	if (basket[i] instanceof Banana) {
			//	String origin = ((Banana) basket[i]).origin;
		//		System.out.println("������:" + origin);
		//	}
		//}
		
		for(int i =0; i < basket.length; i++) {
			basket[i].showInfo();
			if(basket[i]instanceof Peach) {
				String origin =((Peach)basket[i]).origin;
				System.out.println("������:" + origin);
				
			}
		}
			
		}
	}


