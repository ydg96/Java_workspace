package ch04;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class HackerNews implements writeArticle{

	private String printDate() {
		//  ��¥ ������ String���� ��ȯ�ϱ� ���� ���� ���� 
		DateFormat formater = new SimpleDateFormat("yyyy.MM.dd");
		return formater.format(Calendar.getInstance().getTime());
	}
	
	public void printArticle(String article) {
		System.out.println(" *** HackerNews *** ");
		System.out.println();
		System.out.println(article);
		System.out.println();
		System.out.println("��� �ۼ��� : " + printDate());




	}
	
	}

