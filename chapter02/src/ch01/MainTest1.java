package ch01;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Order order = new Order();
		//값을 입력하고 출력까지 해봅시다.
		
		order.orderID = 77004043;
		order.buyerID = "이나경";
		order.sllerID = "윤진한";
		order.productID = 412144;
		order.orderDate = "8월23일";
		
		System.out.println(order.orderID);
		System.out.println(order.buyerID);
		System.out.println(order.sllerID);
		System.out.println(order.productID);
		System.out.println(order.orderDate);
		
		System.out.println("---------------");
		
		UserInfo userinfo1 =new UserInfo();
		System.out.println("회원가입");
		
		userinfo1.userId = "이름 : 윤동근";
		userinfo1.userpassWord ="비밀번호 : 동근12!!";
		userinfo1.userAddress = "주소 : 부산진구";
		userinfo1.phoneNember ="폰번호 : 01077004043";
		
	    System.out.println(userinfo1.userId);
	    System.out.println(userinfo1.userpassWord);
	    System.out.println(userinfo1.userAddress);
	    System.out.println(userinfo1.phoneNember);
	    
		
	}

}
