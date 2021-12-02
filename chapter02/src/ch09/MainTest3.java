package ch09;


import java.util.Calendar;

public class MainTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		Company company3 = Company.getInstance();
		Company company4 = Company.getInstance();
		Company company5 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		Calendar calendar1 = Calendar.getInstance();
	    Calendar calendar2 = Calendar.getInstance();
		//System.out.println(Calendar.getTimeInMillis());
			
		//Sysout.out.println(calendar2);
		
	}

}
