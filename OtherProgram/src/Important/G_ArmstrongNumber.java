package Important;

import java.util.Scanner;

//1*1*1+5*5*5+3*3*3=153    
 
public class G_ArmstrongNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number : ");
	int num=sc.nextInt();
	int a=num,r=0;
	int sum=0;
	
	while(num>0) {
		
	r=num%10;
	num=num/10;
	sum=sum+r*r*r;
	}
	if (a==sum) {
		System.out.println("Arms");
	} else {
    System.out.println("Not");
	}
	
	
	
	
	
	
	
		
	 
}
}
