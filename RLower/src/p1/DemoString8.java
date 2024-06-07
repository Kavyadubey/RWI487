package p1;
import java.util.*;

public class DemoString8 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		char ch;
		for(int i = 0 ; i <= str.length()-1 ; i++) {
			 ch = str.charAt(i);
		
			if(ch >= 'a' && ch <= 'z' ) {
				
			}
			else {
				System.out.print(ch);
			}
		}
		sc.close();
	}

}
