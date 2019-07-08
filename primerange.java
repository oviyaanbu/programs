import java.math.BigInteger;
import java.util.Scanner;
public class Primerange {
 public static void main(String args[]) {
	 int r2,r3,r4,flag=0,i,j;
	 Scanner scan=new Scanner(System.in);
	 r2=scan.nextInt();
	 r3=scan.nextInt();
	 for(i=r2;i<=r3;i++) {
		BigInteger b = new BigInteger(Integer.toString(i));
		if(b.isProbablePrime(i))
			System.out.println(i);
	 }
	 
 }
}


