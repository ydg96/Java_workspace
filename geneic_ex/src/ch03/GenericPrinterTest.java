package ch03;

import ch02.Plastic;
import ch02.Powder;

public class GenericPrinterTest {

	public static void main(String[] args) {

		//���
		
		Powder powder =new Powder();
		Plastic plastic=new Plastic();
		
		//����� �� �ڷ����� �־� �ָ�ȴ�.
		//�����:T ��ſ� ����� �� � �ڷ����� ������� ������ �ָ� �ȴ�.
		
		GenericPrinter<Powder>genericPrinter=new GenericPrinter<>();
	    
		//���ֱ�
		genericPrinter.setMaterial(powder);
		
		//��Შ����
		Powder tempPowder=genericPrinter.getMaterial();
		System.out.println(tempPowder.toString());
		
		//���� 1 �ö�ƽ���� ������ Ŭ������ �����ϰ� ��� ���� �� ��Ḧ ���� ���ô�.
		GenericPrinter<Plastic>genericPrinter2=new GenericPrinter<>();
		genericPrinter2.setMaterial(plastic);
		
		Plastic plastic2=genericPrinter2.getMaterial();
		System.out.println(plastic2.toString());
			
			
		}
		
		
		
		
	
	
	
	
	}


