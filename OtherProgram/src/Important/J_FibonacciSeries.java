package Important;

import java.util.Scanner;

public class J_FibonacciSeries {
	
public static void main(String[] args) {
	Scanner A= new Scanner(System.in);
	System.out.println("Enter Number :");
	int num = A.nextInt();
	int t1 = 0;
	int t2 = 1;
	int sum=0;
	for (int i = 0; i<=num; i++) {
	 System.out.print(t1 + "  ");
	 sum=t1+t2;
	 t1=t2;
	 t2=sum;
	}
}
}
