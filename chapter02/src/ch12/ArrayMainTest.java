package ch12;

import java.util.Iterator;

public class ArrayMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book(1, " �帣�� ����ó��" , "�ĺ���ڿ���");
		Book book2 = new Book(2, " �÷���UI����" , "���ȣ");
		Book book3 = new Book(3, " ����ȭ �����Ǿ����ϴ�" , "������");
		Book book4 = new Book(4, " �������θ����϶�" , "������");
		Book book5 = new Book(5, " ���ǿ���" , "�����϶�");
		
		//����
		//�迭�� �̿��ؼ� ShoppingCart ������ ��� ���ô�.
		Book[]ShoppingCart = new Book[10];
		//1.�迭�� �����ϰ� ũ�⸦ 10���� ����� ���ô�.
		//2.��� ���� å�� ��ٱ��Ͽ� ��ƺ��ô�.
		ShoppingCart[0] = book1;
		ShoppingCart[1] = book2;
		ShoppingCart[2] = book5;
		
		//3. ��ٱ��Ͽ� ���� ������ ȭ�鿡 ����ϼ��� .�� null�� ������� ���ÿ�.
		System.out.println(ShoppingCart[0]);
		System.out.println(ShoppingCart[1]);
		System.out.println(ShoppingCart[5]);
	
		for (int i = 0; i < ShoppingCart.length; i++) {
			if(ShoppingCart[i]!= null) {
				ShoppingCart[i].showInfo();
			}
			
		}
		//4.0���� �ε����� �������� ���� å�� �߰��ϰ�
		//������ �ִ� [0],[1],[2]
		ShoppingCart[0] = book3;
		ShoppingCart[1] =book1;
		ShoppingCart[2] = book2;
		ShoppingCart[3] = book5;
		System.out.println("------------------------");
		
		//Ȯ�� for��
		for (Book book : ShoppingCart) {
			//���࿡ null�� �ƴ϶�� ������ּ���
			if(book != null) {
				book.showInfo();
			}
			
		}
		System.out.println("------------------------");
		//�ε��� 3���� ����������.
		ShoppingCart[3] = null;
		for(Book abc : ShoppingCart) {
			//����� �ڵ�
			if(abc != null) {
				abc.showInfo();
			}
		}
		
		
		
		
	}//end of main

}//end of class
