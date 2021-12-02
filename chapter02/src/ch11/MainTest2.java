package ch11;

import ch10.Zealot;

public class MainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//연관된 데이터를 통으로 모아서 관리하기 위한것
		int[]num =new int[12]; 
		
		Zealot[]zealots =new Zealot[12];
		
		//배열은 for 문과 함꼐 많이 사용
		for (int i = 0; i < zealots.length; i++){
			zealots[i] = new Zealot("질럿" + (i+ 1));
	
		}
		//문제1.showInfo , for문 사용해서 출력
		for (int i = 0; i < zealots.length; i++){
			zealots[i].showInfo();

		}
		
		
		
		
		
		
		
	}

}
