package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileInputStream fis =new FileInputStream("assets/Inuput2.txt")){
			byte[]bs =new byte[10];
			fis.read(bs,0,5);
			for(byte b:bs) {
				System.out.println((char)b);
			}
			//문제 1
			//for use index array 변경해주세요
			//System.out.println(":" + i + " 바이트 읽음");
			int i;
			while ((i = fis.read(bs,0,5))!=-1) {
				for(int k=0;k<i;k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(":" + i  + "바이트 읽음");
			}
			
			
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
