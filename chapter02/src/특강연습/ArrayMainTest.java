package Ư������;

public class ArrayMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 =new Book(1,"�帣�� ����ó��","�Ŀ���ڿ���");
		Book book2 =new Book(2,"�÷���UI����","���ȣ");
		Book book3 =new Book(3,"����ȭ ���� �Ǿ����ϴ� ","������");
		Book book4 =new Book(4,"�������θ����϶�","������");
		Book book5 =new Book(5,"���ǿ���","�����϶�");
		
		//����
		//�迭�� �̿��ؼ� shoppingCart ������ ��ü�� ��� ���ô�.
		//1.�迭�� �����ϰ� ũ�⸦ 10���� ����� ���ô�.
		Book[]shoppingCart =new Book[10];
		
		//2.������ å�� ��ٱ��Ͽ� ��� ���ô�.3����
        shoppingCart[0]=book1;
        shoppingCart[1]=book2;
        shoppingCart[2]=book3;
        
        //3.��ٱ��Ͽ� ���� ������ ȭ�鿡 ��� �ϼ���.
        for(int i =0; i <shoppingCart.length; i++) {
        	if(shoppingCart[i]!=null) {
        		shoppingCart[i].showInfo();
        	}
        }
		
        //4.0��° �ε����� �������� ���� å�� ��� ������ �ִ� å�� [1],[2],[3]
        //�ε����� ������ ���ô�.
        shoppingCart[0]= book3;
        shoppingCart[1]= book1;
        shoppingCart[2]= book4;
        shoppingCart[3]= book5;
        
        System.out.println("-------------------------");
        
        for(int i =0; i < shoppingCart.length; i++) {
        	if(shoppingCart[i] != null) {
        		shoppingCart[i].showInfo();
        	}
        }
        //6.�ε��� 3���� ���� ������.
        shoppingCart[3] =null;
        System.out.println("----------------------");
        for(int i =0; i <shoppingCart.length; i++) {
        	if(shoppingCart[i]!=null) {
        		shoppingCart[i].showInfo();
        	}
        }
	}

}
