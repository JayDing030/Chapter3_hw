package chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample23 {
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("請輸入兩個整數");
		
		BufferedReader br = 
        		new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
        
        int ans = Math.max(num1,num2);
        System.out.println(num1 +" 與 "+ num2+" 中較大的是 "+ ans);
	}
}
