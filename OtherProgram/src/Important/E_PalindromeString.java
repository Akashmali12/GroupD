package Important;

import java.util.Scanner;

public class E_PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String Str=sc.next();
		
		String Org_Str=Str;
		String rev=" ";
		int len =Str.length();
		for (int i = len-1; i>=0; i--)
		  {
			rev=rev+Str.charAt(i);
	      }
		
		System.out.println("Reverse String is "+ rev);
		
		if (Org_Str.equalsIgnoreCase(rev)) 
		{
			System.out.println(Org_Str +" is Palindrome String.");
		} 
		else 
		{
			System.out.println(Org_Str +" is Not Palindrome String.");
		}
	}
}
