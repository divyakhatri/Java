import java.util.Scanner;

public class alphanum
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Please enter any alphanumeric String");
String str = sc.nextLine();

if (str.contains('A'-'Z') && str.contains('0'-'9') && str.contains('a'-'z'))
{
System.out.println("Your entered String is alphanumeric");
}
else if (str.contains('A'-'Z') || str.contains('a'-'z') && str.contains('0'-'9'))
{
System.out.println("Your entered String is alphanumeric");
}
else if (str.contains('0'-'9'))
{
System.out.println("Your entered String is numeric");
}
else if (str.contains('A'-'Z') && str.contains('a'-'z'))
{
System.out.println("Your entered String is not alphanumeric");
}
else
System.out.println("Your entered String is not alphanumeric");
}
}

