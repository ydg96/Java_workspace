package ch01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("���ĺ� �������� ���� [Enter]�� ��������");

		int i;
		
		try{
			//����Ʈ�� ���ڷ� �������ִ� �༮ --���� ��Ʈ��
			InputStreamReader irs =new InputStreamReader(System.in);
			
				
		
	//while((i = System.in.read()) != '\n') {
			while((i = irs.read()) != '\n') {
			//ȭ�鿡 ���
			System.out.print((char)i);
		}
	}catch(IOException e) {
		
	}
	}
}
