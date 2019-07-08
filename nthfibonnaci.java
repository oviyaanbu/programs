import java.util.Scanner;
public class Nthfibonacci{
	public static void main(String args[])
	{
		int n,a1=0,b1=0,c=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=scan.nextInt();
		System.out.println("Fibonacci Series:");
		for(int i=1;i<=n;i++)
		{
			a1=b1;
			b1=c;
			c=a1+b1;
		}

		System.out.println(c+" ");
	}
	
}
