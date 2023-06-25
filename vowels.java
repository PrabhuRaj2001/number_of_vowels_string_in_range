package sample;
import java.util.*;
public class prabhu {
	
	static int a=12;

	public static void main(String[] args) throws Exception {
		
		String a[]={"hey","aeo","mu","ooo","artro"};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			int len=a[i].length()-1;
			if((a[i].charAt(0)=='a'||a[i].charAt(0)=='e'||a[i].charAt(0)=='i'||a[i].charAt(0)=='o'||a[i].charAt(0)=='u')&& (a[i].charAt(len)=='a'||a[i].charAt(len)=='e'||a[i].charAt(len)=='i'||a[i].charAt(len)=='o'||a[i].charAt(len)=='u'))
			{
				count++;
			}
			
		}
		System.out.println(count);
	}
	
	
}
