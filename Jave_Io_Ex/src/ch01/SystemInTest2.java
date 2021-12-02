package ch01;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("알파벳 여러개를 쓰고 [Enter]를 누르세요");

		int i;
		
		try{
			//바이트를 문자로 변경해주는 녀석 --보조 스트림
			InputStreamReader irs =new InputStreamReader(System.in);
			
				
		
	//while((i = System.in.read()) != '\n') {
			while((i = irs.read()) != '\n') {
			//화면에 출력
			System.out.print((char)i);
		}
	}catch(IOException e) {
		
	}
	}
}
