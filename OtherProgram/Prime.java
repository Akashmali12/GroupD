 package other;

//import java.util.Scanner;

public class Prime {
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  number");
		int num=scan.nextInt();
		int count=1;
		//System.out.println("Digit is " + num);
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				count++;
				
			}
		}
		if(count<=2)
		{
			System.out.println(" prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
		
	}


	}	
	
