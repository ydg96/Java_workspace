package ch04;

public class MyArticle{

	String article; 
	writeArticle writeArticle;
	
	// �ּҰ� ����
	public MyArticle(String article, writeArticle writeArticle) {
		this.article = article; 
		this.writeArticle = writeArticle;
	}
	
	public void complete() {
		writeArticle.prinAtrticle(article);
	}
	



}
