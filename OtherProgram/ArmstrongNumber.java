package other;

import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
	int num, temp, r=0 ,sum=0;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter number:- ");  
	num=s.nextInt();
	temp=num;
	while (temp>0) {
		r=temp%10;//3 5 
		sum=sum+(r*r*r);//27 125
		temp=temp/10;//15 5 
	}
		if (num==sum) {
		System.out.println("Given number is Armstrong ");
	}
	else {
		System.out.println("Given number is Not Armstrong");
	}
}
}
