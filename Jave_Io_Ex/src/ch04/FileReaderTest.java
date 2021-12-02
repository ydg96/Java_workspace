package ch04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileReader fr =new FileReader("assets/article.txt")){
			int i;
			while((i = fr.read())!= -1) {
				System.out.println((char)i);
			}
		
			}	catch(IOException e) {
				System.out.println(e);
			
		}
	}

}
