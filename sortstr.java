import java.util.Scanner;
import java.util.Arrays;

public class sortstr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Enter Any String: ");
		str = sc.nextLine();
		
		String lowstr = str.toLowerCase();
		String repstr=lowstr.replaceAll(" ", "");
		char [] crepstr=repstr.toCharArray();
		Arrays.sort(crepstr);
		String sorted = String.valueOf(crepstr);
		System.out.println("The sorted string is: "+sorted);
	}
}
		