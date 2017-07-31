import java.util.Scanner;

public class binarysearch
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any five numbers in ascending order");
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
		arr[i] = sc.nextInt();	
		}
		System.out.println("Enter any number to search");
		int search = sc.nextInt();
		int first = 0;
		int last = arr.length-1;
		int mid = (first+last)/2;
		
		while(first<=last)
		{
			if(arr[mid]<search)
			{
				first=mid+1;
			}
			else if(arr[mid]==search)
			{
			System.out.println("The index of "+search+" is "+mid);
			break;
			}
			else
			{
			last=mid-1;
			}
			mid = (first+last)/2;
		}
		if (first>last)
		{
			System.out.println(search+" is not there in the list");
		}
		
	}
}

		