import java.util.*;
import java.util.Scanner;
public class DigitCount {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int input1=scan.nextInt();
	  int count=1;
	  while(input1>10) {
		  input1=input1/10;
		  count=count+1;
	  }
	 System.out.println("Digit Count: "+count);
  }
}              
