package Important;

import java.util.Scanner;

public class B_ReverseNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value :");
	int num=sc.nextInt();
	
	//using Algorithms
	int rev = 0;
	
	while (num!=0) {

	 rev = rev*10+num%10;
	 num=num/10;
		
	}
	 
	//using StringBuffer Class
//	StringBuffer sb=new StringBuffer(String.valueOf(num));
//	StringBuffer rev=sb.reverse();

	//Using StringBuilder class
//	StringBuilder sb=new StringBuilder();
//	sb.append(num);
//	StringBuilder rev =sb.reverse();
	System.out.println("reverse number is"+ rev);
		
}
}
