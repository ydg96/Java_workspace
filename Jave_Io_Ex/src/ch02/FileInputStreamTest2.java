package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis =null;
		try {
			fis =new FileInputStream("assets/Input.txt");
			int i;
			try {
				while((i = fis.read())!= -1) {
					System.out.println((char)i);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(Exception e2) {
				System.out.println(e2);
			}
			
		}
		
	}

}
