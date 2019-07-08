
import java.util.Scanner;
public class RemovingCharacter {
public static void main(String[] args) {
String string;
char character;
Scanner scan = new Scanner(System.in);
System.out.println("Enter the string");
string = scan.nextLine();
System.out.println("Enter the character");
character = scan.next().charAt(0);
int j;
char[] charArray = string.toCharArray();
for(int i = j = 0;i < charArray.length;i++,j++)
{
if(charArray[i] == character)
{
charArray[j] = charArray[i+1];
i++;
}
else
{
charArray[j] = charArray[i];
}
System.out.print(charArray[j]);
}
scan.close();
}
}

