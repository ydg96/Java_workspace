package ch11;

import java.util.ArrayList;

import ch12.Book;

public class ArrayListMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Book book1 = new Book(1, " 흐르는 강물처럼" , "파블로코엘료");
		Book book2 = new Book(2, " 플러터UI실전" , "김근호");
		Book book3 = new Book(3, " 무궁화 꽃이피었습니다" , "김진명");
		Book book4 = new Book(4, " 리딩으로리드하라" , "이지성");
		Book book5 = new Book(5, " 사피엔스" , "유발하라리");
		
		//ArrayList
		//사용방법
		
		//데이터를 담을 공간 만들기
		//ArrayList 배열과 달리 공간에 크기를 먼저 선언할 필요가 없다.
		
		ArrayList<Book> ShoppingCart = new ArrayList<Book>();
		
		//추가 방법1
		//데이터 추가하기(값 넣기)3개만 넣어 봅시다.
		ShoppingCart.add(book1);//[0] //[76]
		ShoppingCart.add(book2);//[1]
		ShoppingCart.add(book5);//[2]
		
		//추가방법2
	    ShoppingCart.add(0, book3);
	    
	    //삭제하는 방법
	   // ShoppingCart.removeAll(0);
	    ShoppingCart.remove(3);
	    //응용
	    
	    
	    //사이즈 구하기
	    int mysize =ShoppingCart.size();
	    System.out.println("My size" + mysize);
	    //Arraylist 에 크기는 : 3
	    //Arraylist 에 인덱스에 크기는 :0~2까지
	    ShoppingCart.remove(mysize - 1);
	    
	    
	    
	    
	    System.out.println("--------------------");
	    
	    
	    
	    //화면에 출력
	    for(int i =0; i < ShoppingCart.size();i++) {
	    	ShoppingCart.get(i).showInfo();
	    }
	 
	    //수정하기 set
	    ShoppingCart.set(1, book4);
	    System.out.println("-----------------");
	    
	    for (Book book : ShoppingCart) {
			book.showInfo();
		}
			
		
	    //C R U D
	    //create , read ,update , delete
		
		
		
		
		
		
		
		
		
		
	}

}
