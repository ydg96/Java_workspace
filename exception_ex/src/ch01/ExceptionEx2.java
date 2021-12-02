package ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ExceptionEx2{

	public static void main(String[] args){

		FileInputStream fis;
		
		try {
			
			fis = new FileInputStream("a.txt");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("여기도 실행이 되나요?");
		}
		
	}

}
