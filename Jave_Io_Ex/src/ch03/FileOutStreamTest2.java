package ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutStreamTest2 {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileInputStream fos =new FileInputStream("Output2.txt,false");

		//Java 9���� �����Ǵ� ���
		
		try(fos) {
			byte[]bs =new byte[26];
			byte data =65;
			//����1
			//for��
			//���� 26�ݺ��ؼ� A-Z ���Ͽ� ������ ���ô�.
			
			//�迭�� �Ѳ����� ����ϱ� -> ���� Ȯ���ؼ� �����
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
