package Ư������;

import java.util.ArrayList;

public class ArrayListMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Book book1 =new Book(1,"�帣�� ����ó��","�Ŀ���ڿ���");
		Book book2 =new Book(2,"�÷���UI����","���ȣ");
		Book book3 =new Book(3,"����ȭ ���� �Ǿ����ϴ� ","������");
		Book book4 =new Book(4,"�������θ����϶�","������");
		Book book5 =new Book(5,"���ǿ���","�����϶�");
	
	
		//ArrayList ����
        //�����
		
		//�����͸� ���� ���� �����
		//! ArrayList �迭�� �޸� ������ ũ�⸦ ���� ������ �ʿ䰡 ����.
		ArrayList<Book>shoppingCart =new ArrayList<Book>();
		
		
		//�߰���� 1
		//������ �߰��ϱ�(�� �ֱ�)1���� �־� ���ô�.
		shoppingCart.add(book1);
		shoppingCart.add(book2);
		shoppingCart.add(book3);
		
		//ȭ�鿡 ���
		for(int i =0; i <shoppingCart.size(); i++) {
			shoppingCart.get(i).showInfo();
		}
		//�߰� ���2
		//shoppingCart �� �����͸� �߰� ��, ������Ʈ�� ���� ���� ����� �� �ֵ���(index 0��°)
		shoppingCart.add(0,book5);
		
		System.out.println("------------------");
		for (Book book : shoppingCart) {
			book.showInfo();
		}
		//�����ϱ�
		//shopping.remove(3);
		//size()�޼��� ���� //ArrayListũ��� 4,������ �ε����� ��ȣ�� 3
		shoppingCart.remove(shoppingCart.size()-1);
		
		System.out.println("---------------------");
		for (Book book : shoppingCart) {
			book.showInfo();
		}
		//�����ϱ�
		shoppingCart.set(0, book4);
		
		System.out.println("-------------------");
		for (Book book : shoppingCart) {
			book.showInfo();
		}
		//C R U D
		//create read update delete
		
		
		
	
	
	
	}

}
