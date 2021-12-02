package ch04;

public class MyArticle{

	String article; 
	writeArticle writeArticle;
	
	// 주소값 연결
	public MyArticle(String article, writeArticle writeArticle) {
		this.article = article; 
		this.writeArticle = writeArticle;
	}
	
	public void complete() {
		writeArticle.prinAtrticle(article);
	}
	



}
