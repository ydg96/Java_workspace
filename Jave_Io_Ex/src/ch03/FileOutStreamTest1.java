package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileOutputStream fos =new FileOutputStream("Output",true)){
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
