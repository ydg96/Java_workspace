package ch11;

import java.util.ArrayList;

import ch12.Book;

public class ArrayListMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Book book1 = new Book(1, " �帣�� ����ó��" , "�ĺ���ڿ���");
		Book book2 = new Book(2, " �÷���UI����" , "���ȣ");
		Book book3 = new Book(3, " ����ȭ �����Ǿ����ϴ�" , "������");
		Book book4 = new Book(4, " �������θ����϶�" , "������");
		Book book5 = new Book(5, " ���ǿ���" , "�����϶�");
		
		//ArrayList
		//�����
		
		//�����͸� ���� ���� �����
		//ArrayList �迭�� �޸� ������ ũ�⸦ ���� ������ �ʿ䰡 ����.
		
		ArrayList<Book> ShoppingCart = new ArrayList<Book>();
		
		//�߰� ���1
		//������ �߰��ϱ�(�� �ֱ�)3���� �־� ���ô�.
		ShoppingCart.add(book1);//[0] //[76]
		ShoppingCart.add(book2);//[1]
		ShoppingCart.add(book5);//[2]
		
		//�߰����2
	    ShoppingCart.add(0, book3);
	    
	    //�����ϴ� ���
	   // ShoppingCart.removeAll(0);
	    ShoppingCart.remove(3);
	    //����
	    
	    
	    //������ ���ϱ�
	    int mysize =ShoppingCart.size();
	    System.out.println("My size" + mysize);
	    //Arraylist �� ũ��� : 3
	    //Arraylist �� �ε����� ũ��� :0~2����
	    ShoppingCart.remove(mysize - 1);
	    
	    
	    
	    
	    System.out.println("--------------------");
	    
	    
	    
	    //ȭ�鿡 ���
	    for(int i =0; i < ShoppingCart.size();i++) {
	    	ShoppingCart.get(i).showInfo();
	    }
	 
	    //�����ϱ� set
	    ShoppingCart.set(1, book4);
	    System.out.println("-----------------");
	    
	    for (Book book : ShoppingCart) {
			book.showInfo();
		}
			
		
	    //C R U D
	    //create , read ,update , delete
		
		
		
		
		
		
		
		
		
		
	}

}
