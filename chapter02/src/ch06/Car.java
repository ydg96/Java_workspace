package ch06;

public class Car {

	String name;
	int price;
	//���� Ÿ��(���� ����)
	Engine engine;
	 
	public Car(	String name ,int price){

	
		this.name =name;
		this.price =price;
		this.engine =new Engine("GDI",500);
			}
	public void showInfo() {
		System.out.println("�̸�:"+name);
		System.out.println("����:"+price);
	}
	
}	

