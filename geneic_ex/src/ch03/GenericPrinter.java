package ch03;

import ch02.Plastic;
import ch02.Powder;

//���׸� �ڷ���
public class GenericPrinter <T>{
	//T��� ��ü ���ڸ� ���,E - element, K- key , V - value(��� �ƹ� ���ڳ� ��밡��)
	//�ڷ��� �Ű�����(type parameter)
	//�� Ŭ������ ����ϴ� �������� ���� ����� �ڷ����� ������ �մϴ�.
	
	private T material; //T�ڷ������� ������ ����

		

	public T getMaterial() {
		return material;


	}
	public void setMaterial(T material) {
		this.material = material;
	}



	//toString �������̵�
	@Override
	public String toString() {
		return material.toString();
	}

	
}
