package maccess;
import java.util.*;

public class DemoBinarySearch {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of array : ");
			int n = sc.nextInt();
			int[] a = new int[n];
			
			System.out.println("Insert value in array : ");
			for(int i = 0 ; i < a.length ; i ++) {
				a[i] = sc.nextInt();
			}
			
			int temp;
			for(int i = 0 ; i < a.length ; i ++) {
				for(int j = 0 ; j < a.length-1 ; j ++) {
					if(a[j] > a[j + 1]) {
						temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
				}
			}
			System.out.println("Shorted array : ");
			for(int j = 0 ; j < a.length ; j ++) {
				System.out.print(a[j]+" ");
			}
			
			System.out.println();
			System.out.println("Enter the no. which you want to search : ");
			int search = sc.nextInt();
			int li = 0, hi = a.length-1;
			int mi = (li + hi) /2;
			while(li <= hi) {
				if(a[mi] == search) {
					System.out.println("Element is in "+mi+" index position.....");
					break;
				}
				else if(a[mi] < search) {
					li = mi+1;
				}
				else {
					hi = mi-1;
				}
				mi = (li+hi)/2;
			}
		}

	}


