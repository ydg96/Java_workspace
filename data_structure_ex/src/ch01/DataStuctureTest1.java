package ch01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class DataStuctureTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer>set1 =new HashSet<>();
		
		
		//������ Ȯ��
		System.out.println(set1.size());
		
		set1.remove(1);
		System.out.println(set1);
		//set1.clear();
		//System.out,println(set1);
		System.out.println(set1.isEmpty());
		
		//for�� ����
		for(int i =0; i<set1.size(); i++) {
			System.out.println("set1�� : Ȯ��" + i);
		}
       for (Integer integer : set1) {
	
    	   System.out.println(integer);
}
       //while�����
       //��� ��ȸ(�ݺ���)�÷��� �����ӿ�ũ�� ����� ��Ҹ� �ϳ��� ���ʷ� ���� �ϴ°�
       Iterator iter =set1.iterator();
       while(iter.hasNext()) {
    	   System.out.println("�� Ȯ��:" + iter.next());
       }
		
       HashSet<Integer>set2=new HashSet<>();
       System.out.println("-------------------");
       set2.add(getRandomNumber());
       set2.add(getRandomNumber());
       set2.add(getRandomNumber());
       set2.add(getRandomNumber());
       set2.add(getRandomNumber());
       set2.add(getRandomNumber());
       System.out.println(set2);
	}
	public static int getRandomNumber() {
		Random random =new Random();
		int value =random.nextInt(45) + 1;
		return value;
	}

}
