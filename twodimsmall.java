import java.util.Scanner;

public class twodimsmall
{
	public static void main(String[] args)
	{
            Scanner sc = new Scanner(System.in);
		
            System.out.println("Enter any 12 numbers to check the smallest one");

            int arr[][]=new int[4][3];
            
                for(int row=0;row<arr.length;row++)
                {
                    for (int col=0;col<arr[row].length;col++)
                {
                    arr[row][col] = sc.nextInt();
                }
                }
                
                int small = arr [0][0];
                
                for (int r=0; r<arr.length;r++)
                {
                    for (int c=0; c<arr[r].length;c++)
                    {
                        if (arr [r][c]<small)
                        {
                            small=arr [r][c];
                        }
                
                    }
			
                }
                
                System.out.println("The smallest element is: "+small);
	}
}
