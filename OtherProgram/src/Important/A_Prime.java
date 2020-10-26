package Important;

//import java.util.Scanner;

//Prime number is divisible by 1 and itself.//
public class A_Prime {
	public static void main(String[] args)
	{
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter  number");
//		int num=scan.nextInt();
		int count=0, num=3;
		for(int i=1;i<=num;i++)
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
