package ch02;

public class MainTest1 {

	public static void main(String[] args) {

		//���
		Powder powder =new Powder();
		Plastic plastic = new Plastic();
		
		ThreeDprinter1 dprinter1 = new ThreeDprinter1();
		//��� ����
		dprinter1.setMaterial(powder);

		//��Ḧ ������ Ȯ��
		Powder tempPowder =dprinter1.gerMaterial();
		System.out.println(tempPowder.toString());
		
		///////////
		ThreeDprinter2 dprinter2 =new ThreeDprinter2();
		dprinter2.setMaterial(plastic);
		Plastic plastic2=dprinter2.getMaterial();
		System.out.println(plastic.toString());
		
		System.out.println("-----------------------");
		
		ThreeDprinter3 printer3=new ThreeDprinter3();
		//��� ����
		printer3.setMaterial(powder);
		
		//�ڷḦ ��������
		Powder tempPowder2 =(Powder)printer3.getMaterial();
		System.out.println(tempPowder2.toString());

}
}