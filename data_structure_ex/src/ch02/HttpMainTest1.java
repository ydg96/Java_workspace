package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpMainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		URL url;
		try {
			url = new URL("https://jsonplaceholder.typicode.com/todos/1");

			HttpURLConnection connection =(HttpURLConnection)url.openConnection();

			connection.setRequestMethod("GET"); //POST
			connection.setRequestProperty("Content=type" , "application/json");
			connection.connect();
			
	
			int statusCode =connection.getResponseCode();
			
		    System.out.println("statusCode" + statusCode);
			
		    BufferedReader reader =new BufferedReader(new InputStreamReader(connection.getInputStream()));
			StringBuffer sb =new StringBuffer();
		    String line=null;
		    if(statusCode==200) {
		    	while((line=reader.readLine())!=null) {
		    		sb.append(line);
		    	}
		    }else {
		    	System.out.println("서버에 연결을 할수 없습니다."); 
		
		    }
		    String str =sb.toString();
		    System.out.println(str);
		    System.out.println("================");
		/*    System.out.println(str.substring(4,10));
		    System.out.println(str.substring(13,14));
		    
		    Todo todo =new Todo();
		    todo.Id =str.substring(13,14);*/
		
		    
		    
	
		    
		    
		//    System.out.println(Todo.id);
		//    System.out.println(Todo.title);
		//    System.out.println(Todo.userId);
		//    System.out.println(Todo.completed);
		   
		    
		
		
		    	
		    	
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		}catch (IOException e) {
			
		}
	}
	
}
			
		
		



