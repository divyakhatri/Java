import java.util.Scanner;

public class strtoint
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
		String str1;
		System.out.println("Enter a Numeric String: ");
		str1 = sc.nextLine();
                
                int result = Integer.parseInt(str1);
                System.out.println("The String "+str1+" converted to Int is: "+result);
	}
}