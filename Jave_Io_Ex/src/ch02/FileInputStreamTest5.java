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
			//���� 1
			//for use index array �������ּ���
			//System.out.println(":" + i + " ����Ʈ ����");
			int i;
			while ((i = fis.read(bs,0,5))!=-1) {
				for(int k=0;k<i;k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(":" + i  + "����Ʈ ����");
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
