package ch11;

public class ArrayMAinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열
		//배열이란 연관된 데이터를 모아서 통으로 관리하기 위해 사용하는 데이터 타입이다.
		//변수가 하나의 테이터를 저장하기 위한 것이라면 배열은 여러개의 데이터를 하나의 변수에
		//저장하기 위한 것이라고 할수 있다.
		
		int number =10;
		
		//선언방법
		int[] arr1=new int[3];
		int arr2[] = new int[10];
		
		//초기화 하는방법(값을 넣는 방법)
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;
		
		//배열 선언과 동시에 초기화 하기
		int[] numbers1 = new int[ ]{11,20,30};
		int[] numbers2 = {10,50,100};
		
		//출력방법
		System.out.println(numbers1[0]);
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]);
		System.out.println("==============================");
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]);
		System.out.println(numbers2[2]);
		
		//스트링 
		String[]strArr =new String[10]; 
	    strArr[0]="야스오";
	    strArr[1]="티모";
	    strArr[2]="애쉬";
	    strArr[3]="다리우스";
	    
	    //문제.1 strArr 0 ,1 , 2 , 3 단 for금지
	    
	  /* System.out.println(strArr[0]);
	    System.out.println(strArr[1]);
	    System.out.println(strArr[2]);
	    System.out.println(strArr[3]);*/

	    //모든 프로그래밍 언어에서는 index 0부터 시작을 합니다.
	    //배열을 사용할때 모든 for문과 관계에서 많이 사용 합니다.
	                         //배열의 크기(length)
	   
	   // System.out.println(strArr[10]);//index의 크기는 n -1 개 이다.
	    //new int [22] = //인덱스에 크기는 21개 
	    
	    
	    for (int i = 0; i < strArr.length ; i++) {
	    	//null 값을 출력하지 마시오.
	    	//만약에 null값이 아니면!
	    	//if(strArr[i]==null) {
	    	//	continue;
	    	//}else {
	    		
	    	}
	  //  if(strArr[i]! = null) {
	    	
	    
	 //   }System.out.println(strArr[i]);
	  //  }
	//	
		
	    
		
		
		
 		
	}

}
