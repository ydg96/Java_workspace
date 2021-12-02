package ch05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BerfferedStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
		long millisecond =0;
		
		try(FileInputStream fis =new FileInputStream("a.zip");
			
			FileOutputStream fos =new FileOutputStream("copy.zip");
			)
			{
			millisecond =System.currentTimeMillis();
			
			int i;
			try {
				while((i =fis.read())!= -1) {
					fos.write(i);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			millisecond =System.currentTimeMillis()-millisecond;
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println("파일 복사 하는데" + millisecond + "소요되었습니다");
		}
	
}
