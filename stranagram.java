import java.util.Scanner;
import java.util.Arrays;

public class stranagram
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str1, str2;
		int len, len1, len2;
		int match=0, nomatch=0;
		System.out.println("Enter First String: ");
		str1 = sc.nextLine();
		
		System.out.println("Enter Second String: ");
		str2 = sc.nextLine();
		
		String lowstr1 = str1.toLowerCase();
		String lowstr2 = str2.toLowerCase();
		
		String repstr1=lowstr1.replaceAll(" ", "");
		String repstr2=lowstr2.replaceAll(" ", "");
		
		char [] crepstr1=repstr1.toCharArray();
		char [] crepstr2=repstr2.toCharArray();
		
		Arrays.sort(crepstr1);
		Arrays.sort(crepstr2);
		
		String sorted1 = String.valueOf(crepstr1);
		String sorted2 = String.valueOf(crepstr2);
		
		len1 = sorted1.length();
		len2 = sorted2.length();
		
		if (len1==len2)
		{
			len=len1;
			for (int i=0;i<len;i++)
			{
				match=0;
				for (int j=0;j<len;j++)
				{
					if (sorted1.charAt(i)==sorted2.charAt(j))
					{
						match=1;
						break;
					}
				}
				if (match==0)
				nomatch=1;
				break;
			}
			if (nomatch==1)
			{
				System.out.println("Strings are not anagram");
			}
			else
			{
				System.out.println("Strings are anagram");
			}
			}
		}
}
		