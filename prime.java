import java.util.Scanner;
public class Prime {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int n1;
	int j;
	int y;
	n=scan.nextInt();
		for(j=2,y=2;i<=n1;j++) {
			for(y=2;y<i;y++) {
				if(i%y==0) {
					break;
				}
			}
			if(y==i) {
				System.out.printf("%d is a prime", y);
			}
		}
	}
}
