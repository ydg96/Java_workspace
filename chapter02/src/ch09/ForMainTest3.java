package ch09;

public class ForMainTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.5�� �ݺ��ϴ� for�� �����
		for (int i = 0; i < 4; i++) {
			
			
			for(int j = 0;j < (3-i); j++) {
				System.out.print(" ");
				}  //end of foe - j
			//for
			for(int j = 0; j < (2 * i) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}//end of for - i

	}

}
