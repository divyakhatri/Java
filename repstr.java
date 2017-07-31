import java.util.Scanner;

public class repstr
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
		String str1, str2, repstr;
                str1 = "Replaces the first substring of this string that matches the given regular expression with the given replacement.";
                System.out.println("The given string is: "+str1);
		System.out.println("Enter Any String: ");
		str2 = sc.nextLine();
                System.out.println("Enter Any String to be replaced: ");
		repstr = sc.nextLine();
                
                String replaceStr=str1.replace(str2,repstr);
                
                System.out.println("The replaced string is: "+replaceStr);
    }
    
}
