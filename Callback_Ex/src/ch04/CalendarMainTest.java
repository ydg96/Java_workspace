package ch04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			// Calendar�� ��¥ ���� �ν��Ͻ� �Դϴ�. �޷��̳� �ð������� ��� �� �� ���� ���� �ν��Ͻ� �Դϴ�. 
			Calendar calendar = Calendar.getInstance(); 
			System.out.println(calendar.getTimeInMillis());
			// ���� �����ϱ� ������ ������ ���� ����� �� �ִ�. 
			// ��¥�� ��ȯ ��� ���� 
			DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
			String date = dateFormat.format(calendar.getTimeInMillis()); 
			// ���� �ð��� �������� format �������� ��ȯ 
			System.out.println(date);


		
	}

}
