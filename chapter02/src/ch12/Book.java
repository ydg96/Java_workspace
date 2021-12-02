package ch12;

public class Book {

	int Id;
	String title;
	String author;
	
	public Book(int id, String title , String author) {
		this.Id = id;
		this.title = title;
		this.author = author;
	}
	//¸Þ¼­µå
	public void showInfo() {
		System.out.println("id :" + Id);
		System.out.println("title" + title);
		System.out.println("author" + author);
	}
}
