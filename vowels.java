import java.util.Scanner;

public class vowels
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Please enter a Character to check if it is a vowel or a consonant");
char vowel = sc.next().charAt(0);

	switch (vowel)
	{
	case 'A':
	case 'a':
	case 'E':
	case 'e':
	case 'I':
	case 'i':
	case 'O':
	case 'o':
	case 'U':
	case 'u':
	System.out.println(vowel+" is a vowel");
	break;
	default:
	System.out.println(vowel+" is a consonant");
	break;
	}
}
}
