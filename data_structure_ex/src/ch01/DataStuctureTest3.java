package ch01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	String name;
	int grade;
	
}
public class DataStuctureTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list0;
		
		//순서가 있고 (인덱스)중복이 가능
		ArrayList<Integer>list =new ArrayList<Integer>();
		ArrayList<Student>nembers =new ArrayList<Student>();
		
		//값 추가 방법
		
		list.add(3);
		list.add(null);
		list.add(1,10);
		System.out.println("값 추가 확인:" + list);
		
		//값 삭제 방법
		list.remove(2);
	    System.out.println("값 삭제 확인 remove:" + list);
	    System.out.println(list.size());
	    
	    //값 출력 방법
	    System.out.println(list.get(1));
	    
	    for (Student i : nembers) {
			System.out.println("for 사용법:" + i);
		}
	    //while 사용방법
	    //요소 순회(반복자)컬렉션 프레임워크에 저장된 요소들을 하나씩 차럐로 하는것
	    //문제 1
	    Iterator<Integer>iter = list.iterator();
	    while(iter.hasNext()) {
	    	System.out.println("While 사용법 :" + iter.next());
	    }
	    //ArrayList 값 검색
	    //리스트 안에 값이 있는지 확인 =리턴값 t,f
	    System.out.println(list.contains(1));
	    System.out.println(list.contains(10));
	    
	    //10값이 어디에 있는가?인덱스 번호를 알아야 되는 상황
	    System.out.println(list.indexOf(3));
	    System.out.println(list.indexOf(10));
	    System.out.println(list.indexOf(100));
	    
	}

}
