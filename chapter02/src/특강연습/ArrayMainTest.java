package 특강연습;

public class ArrayMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 =new Book(1,"흐르는 강물처럼","파울로코엘료");
		Book book2 =new Book(2,"플러터UI실전","김근호");
		Book book3 =new Book(3,"무궁화 꽃이 피었습니다 ","김진명");
		Book book4 =new Book(4,"리딩으로리드하라","이지성");
		Book book5 =new Book(5,"사피엔스","유발하라리");
		
		//문제
		//배열을 이용해서 shoppingCart 변수에 객체를 담아 봅시다.
		//1.배열을 선언하고 크기를 10으로 만들어 봅시다.
		Book[]shoppingCart =new Book[10];
		
		//2.사고싶은 책을 장바구니에 담아 봅시다.3개만
        shoppingCart[0]=book1;
        shoppingCart[1]=book2;
        shoppingCart[2]=book3;
        
        //3.장바구니에 담은 정보를 화면에 출력 하세요.
        for(int i =0; i <shoppingCart.length; i++) {
        	if(shoppingCart[i]!=null) {
        		shoppingCart[i].showInfo();
        	}
        }
		
        //4.0번째 인덱스에 선택하지 않은 책을 담고 기존에 있던 책을 [1],[2],[3]
        //인덱스로 수정해 봅시다.
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
        //6.인덱스 3번을 지워 보세요.
        shoppingCart[3] =null;
        System.out.println("----------------------");
        for(int i =0; i <shoppingCart.length; i++) {
        	if(shoppingCart[i]!=null) {
        		shoppingCart[i].showInfo();
        	}
        }
	}

}
