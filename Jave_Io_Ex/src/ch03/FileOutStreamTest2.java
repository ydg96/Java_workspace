package ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutStreamTest2 {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream fos =new FileInputStream("Output2.txt,false");

		//Java 9부터 제공되는 기능
		
		try(fos) {
			byte[]bs =new byte[26];
			byte data =65;
			//문제1
			//for문
			//길이 26반복해서 A-Z 파일에 적성해 봅시다.
			
			//배열을 한꺼번에 출력하기 -> 문서 확인해서 만들기
			for(int i=0; i<bs.length;i++) {
				bs[i]=data;
				data++;
			}
			fos.write(bs);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
				
	}

}
