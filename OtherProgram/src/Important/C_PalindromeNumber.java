package Important;

import java.util.Scanner;

//read number from left to write or write to left its same ex.1221,146641.
public class C_PalindromeNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number : ");
	int num=sc.nextInt();
	int org_num = num,rev = 0;
	
	while (num!=0) {
		rev=rev*10+num%10;
		num=num/10;
	}
	System.out.println(rev);
	if (org_num==rev) {
		System.out.println(org_num +" is Palindrome Number.");
	}
	else {
		System.out.println(org_num +" is not Palindrome Number.");
	}
}
}
