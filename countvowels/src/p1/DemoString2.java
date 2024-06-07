package p1;
import java.util.*;

public class DemoString2 {

		public static void main(String[] args) 
		{
		Scanner s = new Scanner(System.in);
		try(s;){
		System.out.println("Enter the String:");
		String str =s.nextLine().toLowerCase();
		int len = str.length();
		int count=0;

		for(int i=0;i<=len-1;i++)
		{
		char ch = str.charAt(i);
		if(ch=='a' || ch=='e' ||
		ch=='i'|| ch=='o' ||
		ch=='u')
		{
		count++;
		}
		}//end of loop
		System.out.println("Count of Vowels:"+count);
		}//end of try with resource
		}
		}


