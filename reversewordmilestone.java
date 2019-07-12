import java.util.*;
public class reverseword {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		
		String input1=scan.nextLine();
         int input2=scan.nextInt();
		scan.close();
		String[] arr=input1.split(" ");
		int j=input2/10;
		int k=input2%10;
		String str1=words(arr[j-1]);
		String str2=words(arr[k-1]);
		System.out.print(str1+" "+str2);
	}
	public static String words(String letter)
	{
		int length=letter.length();
		int mid=letter.length()/2;
		String temp,temp1;
		if(length%2==0)
		{
			temp=letter.substring(0, mid);
		}
		else
		{
		    temp=letter.substring(0,mid+1);
		}
		
		temp1=letter.substring(mid);
		StringBuffer sbf=new StringBuffer(temp);
		sbf.reverse();
		return sbf.toString()+temp1;
	}

}
