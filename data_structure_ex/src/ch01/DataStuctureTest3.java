package ch01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	String name;
	int grade;
	
}
public class DataStuctureTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list0;
		
		//������ �ְ� (�ε���)�ߺ��� ����
		ArrayList<Integer>list =new ArrayList<Integer>();
		ArrayList<Student>nembers =new ArrayList<Student>();
		
		//�� �߰� ���
		
		list.add(3);
		list.add(null);
		list.add(1,10);
		System.out.println("�� �߰� Ȯ��:" + list);
		
		//�� ���� ���
		list.remove(2);
	    System.out.println("�� ���� Ȯ�� remove:" + list);
	    System.out.println(list.size());
	    
	    //�� ��� ���
	    System.out.println(list.get(1));
	    
	    for (Student i : nembers) {
			System.out.println("for ����:" + i);
		}
	    //while �����
	    //��� ��ȸ(�ݺ���)�÷��� �����ӿ�ũ�� ����� ��ҵ��� �ϳ��� ���m�� �ϴ°�
	    //���� 1
	    Iterator<Integer>iter = list.iterator();
	    while(iter.hasNext()) {
	    	System.out.println("While ���� :" + iter.next());
	    }
	    //ArrayList �� �˻�
	    //����Ʈ �ȿ� ���� �ִ��� Ȯ�� =���ϰ� t,f
	    System.out.println(list.contains(1));
	    System.out.println(list.contains(10));
	    
	    //10���� ��� �ִ°�?�ε��� ��ȣ�� �˾ƾ� �Ǵ� ��Ȳ
	    System.out.println(list.indexOf(3));
	    System.out.println(list.indexOf(10));
	    System.out.println(list.indexOf(100));
	    
	}

}
