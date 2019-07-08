    
import java.io.*;
import java.util.*;
import java.util.Scanner.*;
public class UserMainCode{
    public static int totalHillWeight(int input0,int input,int input2){
        int sum=0,i,j;
        for(i=0;i<input0;i++)
        {
            for(j=0;j<=i;j++)
            sum+=input2;
            input=input+input2;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int d;
        int c=scan.nextInt();
        d=totalHillWeight(a,b,c);
        System.out.println(d);
    }
