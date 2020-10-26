package Important;

import java.util.Scanner;

public class D_ReverseString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number : ");
	String Str=sc.nextLine();
	
	String rev=" ";
	int len =Str.length();
	for (int i = len-1; i>=0; i--) {
		rev=rev+Str.charAt(i);
		}
	
	System.out.println("Reverse String is "+ rev);
}
}
