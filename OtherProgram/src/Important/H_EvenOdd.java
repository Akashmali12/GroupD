package Important;

import java.util.Scanner;

public class H_EvenOdd {
public static void main(String[] args) {
    Scanner a= new Scanner(System.in);
    System.out.println("Enter Number :");
    int num = a.nextInt();
    if (num%2==0) {
		System.out.println("Number is even");
	} else {
		System.out.println("Number is odd");
	}
   
}
}
