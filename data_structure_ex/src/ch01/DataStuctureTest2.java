package ch01;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class DataStuctureTest2 {

	public static void main(String[] args) {
		
	
	Map map;
	//key �� value ������ �����͸� �����Ѵ�.
	
	HashMap<String,String>map1 =new HashMap<String,String>();
	
	//null���� ������� �ʴ´�.
	Hashtable<String,String>map2=new Hashtable<String,String>();	
	
	map1.put("A01","������������");
	map1.put("A02","���������Ĺ�");
	map1.put("A03","��õ���׷κ�");
	map1.put("B01","�������׷κ�");
	map1.put("B02","��õ�����Ĺ�");
	map1.put("C01",null);
	
	System.out.println(map1);
	System.out.println(map1.get("A03"));
	
	//�������
	map1.remove("C01");
	//map1.clear();
	System.out.println(map1);
	//������ Ȯ�� ���
	System.out.println(map1.size());
	
	//
	for (Entry<String,String>entry:map1.entrySet()) {
		System.out.println("[key]" +entry.getKey() + "[value]" + entry.getValue());
	}
	System.out.println("====================");
	
	for(String key:map1.keySet()) {
		System.out.println(key + ":" + map1.get(key));
	}
	
}
}