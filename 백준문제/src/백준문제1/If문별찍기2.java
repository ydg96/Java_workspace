package ���ع���1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class If�������2 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(br.readLine());
		
		StringBuffer sb =new StringBuffer();
		
		for(int i =1; i <= N; i++) {
			for(int j=1; j<=i; j++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		System.out.println(sb);
		
	}

}
