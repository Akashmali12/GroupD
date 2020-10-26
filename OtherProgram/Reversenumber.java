package other;

public class Reversenumber {
	static int C;
public static void main(String[] args) {
	int A=12345;
	int B=0;
	
	while(A!=0) {
	C=A%10;
	B=B*10+C;
	A=A/10;
	}
	System.out.println("Reverse number is" + B);
}
}