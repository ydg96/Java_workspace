package ch11;

public class ArrayMAinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�迭
		//�迭�̶� ������ �����͸� ��Ƽ� ������ �����ϱ� ���� ����ϴ� ������ Ÿ���̴�.
		//������ �ϳ��� �����͸� �����ϱ� ���� ���̶�� �迭�� �������� �����͸� �ϳ��� ������
		//�����ϱ� ���� ���̶�� �Ҽ� �ִ�.
		
		int number =10;
		
		//������
		int[] arr1=new int[3];
		int arr2[] = new int[10];
		
		//�ʱ�ȭ �ϴ¹��(���� �ִ� ���)
		arr1[0] = 33;
		arr1[1] = 10;
		arr1[2] = 11;
		
		//�迭 ����� ���ÿ� �ʱ�ȭ �ϱ�
		int[] numbers1 = new int[ ]{11,20,30};
		int[] numbers2 = {10,50,100};
		
		//��¹��
		System.out.println(numbers1[0]);
		System.out.println(numbers1[1]);
		System.out.println(numbers1[2]);
		System.out.println("==============================");
		System.out.println(numbers2[0]);
		System.out.println(numbers2[1]);
		System.out.println(numbers2[2]);
		
		//��Ʈ�� 
		String[]strArr =new String[10]; 
	    strArr[0]="�߽���";
	    strArr[1]="Ƽ��";
	    strArr[2]="�ֽ�";
	    strArr[3]="�ٸ��콺";
	    
	    //����.1 strArr 0 ,1 , 2 , 3 �� for����
	    
	  /* System.out.println(strArr[0]);
	    System.out.println(strArr[1]);
	    System.out.println(strArr[2]);
	    System.out.println(strArr[3]);*/

	    //��� ���α׷��� ������ index 0���� ������ �մϴ�.
	    //�迭�� ����Ҷ� ��� for���� ���迡�� ���� ��� �մϴ�.
	                         //�迭�� ũ��(length)
	   
	   // System.out.println(strArr[10]);//index�� ũ��� n -1 �� �̴�.
	    //new int [22] = //�ε����� ũ��� 21�� 
	    
	    
	    for (int i = 0; i < strArr.length ; i++) {
	    	//null ���� ������� ���ÿ�.
	    	//���࿡ null���� �ƴϸ�!
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
