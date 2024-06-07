package p1;
import java.util.Scanner;

public class DemoString5 {
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the string");
		String st= s.nextLine();
		int len=st.length();
		char c;
		int cap=0,sm=0,i;
		for(i=0;i<len;i++)
		{
			c=st.charAt(i);
			if(c>='A' && c>='Z')
				cap++;
			else
				sm++;
		}
		System.out.println("Capital letter"+cap);
		System.out.println("small letter"+sm);
	}

}
