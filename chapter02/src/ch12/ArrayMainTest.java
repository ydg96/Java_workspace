package ch12;

import java.util.Iterator;

public class ArrayMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book(1, " 흐르는 강물처럼" , "파블로코엘료");
		Book book2 = new Book(2, " 플러터UI실전" , "김근호");
		Book book3 = new Book(3, " 무궁화 꽃이피었습니다" , "김진명");
		Book book4 = new Book(4, " 리딩으로리드하라" , "이지성");
		Book book5 = new Book(5, " 사피엔스" , "유발하라리");
		
		//문제
		//배열을 이용해서 ShoppingCart 변수에 담아 봅시다.
		Book[]ShoppingCart = new Book[10];
		//1.배열을 선언하고 크기를 10으로 만들어 봅시다.
		//2.사고 싶은 책을 장바구니에 담아봅시다.
		ShoppingCart[0] = book1;
		ShoppingCart[1] = book2;
		ShoppingCart[2] = book5;
		
		//3. 장바구니에 감은 정보를 화면에 출력하세요 .단 null은 출력하지 마시오.
		System.out.println(ShoppingCart[0]);
		System.out.println(ShoppingCart[1]);
		System.out.println(ShoppingCart[5]);
	
		for (int i = 0; i < ShoppingCart.length; i++) {
			if(ShoppingCart[i]!= null) {
				ShoppingCart[i].showInfo();
			}
			
		}
		//4.0번쨰 인덱스에 선택하지 않은 책을 추가하고
		//기존에 있던 [0],[1],[2]
		ShoppingCart[0] = book3;
		ShoppingCart[1] =book1;
		ShoppingCart[2] = book2;
		ShoppingCart[3] = book5;
		System.out.println("------------------------");
		
		//확장 for문
		for (Book book : ShoppingCart) {
			//만약에 null이 아니라면 출력해주세요
			if(book != null) {
				book.showInfo();
			}
			
		}
		System.out.println("------------------------");
		//인덱스 3번을 지워보세요.
		ShoppingCart[3] = null;
		for(Book abc : ShoppingCart) {
			//방어적 코드
			if(abc != null) {
				abc.showInfo();
			}
		}
		
		
		
		
	}//end of main

}//end of class
