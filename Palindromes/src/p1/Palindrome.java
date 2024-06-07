package p1;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		System.out.println(str);
		String rev = "";
		for(int i = str.length()-1 ; i >= 0 ; i --) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println(str+ "Palindrome String : ");
		}
		else {
			System.out.println(str+ "is not a Palindrome String : ");
		}
		sc.close();
	}
	

}


