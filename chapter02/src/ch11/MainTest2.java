package ch11;

import ch10.Zealot;

public class MainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//������ �����͸� ������ ��Ƽ� �����ϱ� ���Ѱ�
		int[]num =new int[12]; 
		
		Zealot[]zealots =new Zealot[12];
		
		//�迭�� for ���� �Բ� ���� ���
		for (int i = 0; i < zealots.length; i++){
			zealots[i] = new Zealot("����" + (i+ 1));
	
		}
		//����1.showInfo , for�� ����ؼ� ���
		for (int i = 0; i < zealots.length; i++){
			zealots[i].showInfo();

		}
		
		
		
		
		
		
		
	}

}
