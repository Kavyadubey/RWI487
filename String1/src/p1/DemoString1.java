package p1;

public class DemoString1 {
	
		public static void main(String[]
		args) {
		String s1 = "nit";;
		int len1 = s1.length();
		String s2 = new String("hyd");
		int len2 = s2.length();
		System.out.println("****StringLiteral process****");

		System.out.println("s1 :"+s1.toString());
		System.out.println("char at index 0 : "+s1.charAt(0));
		System.out.println("char at index 1 : "+s1.charAt(1));
		System.out.println("char at 2 : "+s1.charAt(2));
		System.out.println("length of s1 : "+len1);
		System.out.println("****new operator process****");
		System.out.println("s2 :"+s2.toString());
		System.out.println("char atindex 0 : "+s2.charAt(0));
		System.out.println("char at index 1 : "+s2.charAt(1));
		System.out.println("char atindex 2 : "+s2.charAt(2));
		System.out.println("length of s2 : "+len2);
		}
		}


