package ch01;

public class BookMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("�÷���UI����", "���ȣ");
		Book book2 = new Book("�÷���UI����", "���ȣ");

		System.out.println(book1);
		System.out.println(book1.hashCode());
		
		
		String str = new String("test"); 
		
		System.out.println(str);
		
		System.out.println(str.toString());
		
		// equals �޼��� ������ �ϱ�
		
		// == �ּ� ������ ���Ѵ�. 
		// ������ ��ü �� 
		if(book1 == book2) {
			System.out.println("���� ��ü �Դϴ�.");
		} else {
			System.out.println("book1�� book2�� �ٸ� ��ü �Դϴ�");
		}
		
		System.out.println("-----------------------");
		// eqauls book1 book2 �� ���ּ��� 
		if(book1.equals(book2)) {
			System.out.println("���� ��ü �Դϴ�.");
		} else {
			System.out.println("boo1�� boo2�� �ٸ� ��ü �Դϴ�");
		}



	}

}
