package ch02;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileInputStream fis =new FileInputStream("assets/Inuput2.txt")){
			
			byte[]bs =new byte[10];
			int i;
			
			while((i =fis.read(bs))!=-1) {
			//	for(byte b:bs) {
		//			System.out.print((char)b);
				for(int j=0; j< bs.length; j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(":" + i + "����Ʈ ����");
				}
			}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
