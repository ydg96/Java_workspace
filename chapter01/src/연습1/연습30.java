package 연습1;

public class 연습30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int month = 8;
		int day;
		
		switch(month) {
		case 1:case 3: case 5 : case 7: case 8: case 10: case 12:
			day =31;
			break;
		case 4: case 6: case 9: case 11:
			day =30;
			break;
		case 2:
			day = 28;
			break;
		default:
			day =0;
			System.out.println("존재하지 않는 달 입니다.");
			}
		System.out.println(month + "월은" + day + "일입니다.");
		
	}

}
