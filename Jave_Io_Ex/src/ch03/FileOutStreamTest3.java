package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//try()
		//fileOutStre
		//A-Z
		//fos.write(bs,2,10); 배열의 2번째 위치부터 10개 바이트 출력하기
		
		try(FileOutputStream fos =new FileOutputStream("assets/output.txt")){
			byte[]bs =new byte[26];
			byte data =65;//아스키 코드값
			for(int i =0; i<bs.length;i++) {
				bs[i]=data;
				data++;
			}
			fos.write(bs, 2, 10);
			
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
		System.out.println(e);
		}
		System.out.println("출력이 완료 되었습니다.");
	}

}
