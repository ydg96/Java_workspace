package ch01;

public class StudentMainTest {

	public static void main(String[] args) {

		Student student1=new Student();
		student1.name="È«±æµ¿";
		
		student1.height=175;
		student1.weight=70;
		
		System.out.println(student1);
		System.out.println(student1.name);
		System.out.println(student1.weight);
		System.out.println(student1.height);
		System.out.println("===================");
				
		Student student2=new Student();
		student2.name="À±µ¿±Ù";
		student2.height=174;
		student2.weight=77;
		
		System.out.println(student2);
		System.out.println(student1.name);
		System.out.println(student2.height);
		System.out.println(student2.weight);
		
	}

}
