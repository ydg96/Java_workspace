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
		//fos.write(bs,2,10); �迭�� 2��° ��ġ���� 10�� ����Ʈ ����ϱ�
		
		try(FileOutputStream fos =new FileOutputStream("assets/output.txt")){
			byte[]bs =new byte[26];
			byte data =65;//�ƽ�Ű �ڵ尪
			for(int i =0; i<bs.length;i++) {
				bs[i]=data;
				data++;
			}
			fos.write(bs, 2, 10);
			
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
		System.out.println(e);
		}
		System.out.println("����� �Ϸ� �Ǿ����ϴ�.");
	}

}
