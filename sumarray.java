import java.util.Scanner;

public class sumarray
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int add=0;
		
		System.out.println("Enter any five numbers to check the sum");
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
		arr[i] = sc.nextInt();	
		}
		for(int i=0;i<arr.length;i++)
        {
            add = add + arr[i];
        }
        System.out.println("The sum of the five numbers you have entered is: "+add);
    }
	}
	