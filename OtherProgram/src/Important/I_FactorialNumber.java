package Important;

import java.util.Scanner;

public class I_FactorialNumber {
public static void main(String[] args) {
	Scanner A=new Scanner(System.in);
	System.out.println("Enter Number :");
	int num = A.nextInt();
	
	int fact = 1;
	for (int i = 1; i <=num; i++) {
      fact=fact*i;		
	}
	System.out.println("Factorial of number is :"+fact);
}
}
