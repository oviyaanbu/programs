import java.util.*;
import java.util.Scanner;
public class IsPalindrome {
public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	int input=scan.nextInt();
	int temp=input;
	int rev=0;
	while(input>0) {
		rev=rev*10+input%10;
		input/=10;
	}
	if(temp==rev)
		System.out.println("is palindrome: "+temp);
	else
		System.out.println("Not palindrome");
	
}
}
