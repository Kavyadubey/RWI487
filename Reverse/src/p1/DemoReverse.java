package p1;
import java.util.*;

public class DemoReverse {
	public static void main(String args[])
	{
		String name ="kavya";
		int len = name.length();
		String rev ="";
		for(int i =len-1;i>=0;i--)
		{
			rev = rev+name.charAt(i);
		}
		System.out.println("Reverse of " +name+  "is" + rev);
	}
	

}
