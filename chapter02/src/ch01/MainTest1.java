package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order order = new Order();
		//���� �Է��ϰ� ��±��� �غ��ô�.
		
		order.orderID = 77004043;
		order.buyerID = "�̳���";
		order.sllerID = "������";
		order.productID = 412144;
		order.orderDate = "8��23��";
		
		System.out.println(order.orderID);
		System.out.println(order.buyerID);
		System.out.println(order.sllerID);
		System.out.println(order.productID);
		System.out.println(order.orderDate);
		
		System.out.println("---------------");
		
		UserInfo userinfo1 =new UserInfo();
		System.out.println("ȸ������");
		
		userinfo1.userId = "�̸� : ������";
		userinfo1.userpassWord ="��й�ȣ : ����12!!";
		userinfo1.userAddress = "�ּ� : �λ�����";
		userinfo1.phoneNember ="����ȣ : 01077004043";
		
	    System.out.println(userinfo1.userId);
	    System.out.println(userinfo1.userpassWord);
	    System.out.println(userinfo1.userAddress);
	    System.out.println(userinfo1.phoneNember);
	    
		
	}

}
