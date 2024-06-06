package p1;
import java.util.*;

public class DemoLinearSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Insert value into array : ");
		for(int i = 0 ; i < a.length ; i ++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to search : ");
		int search = sc.nextInt();
		for(int i = 0 ; i < a.length ; i ++) {
			if(search == a[i]) {
				System.out.println("The Searching Element is on "+a[i]+" Index");
				break;
			}
			else {
				System.out.println("Invalid Search.....");
			}
		}
	}


}
