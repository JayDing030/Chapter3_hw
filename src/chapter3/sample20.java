package chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sample20 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入英文字母");
		
        BufferedReader br = 
        		new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        System.out.println("轉換為大寫為"+ str.toUpperCase());
        System.out.println("轉換為小寫為"+ str.toLowerCase());
    }
}
