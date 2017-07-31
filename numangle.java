public class numangle
{
public static void main(String [] args)
{
	int k = 1;
	for (int i=0;i<4;i++)
	{
		for(int j=1;j<=i+1;j++)
		
		{
			System.out.print(k++);    
		}
		for (int j=4;j>i;j--)
		{
			System.out.print(" ");
		}
		System.out.println(" ");
	}
}
}