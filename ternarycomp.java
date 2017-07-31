public class ternarycomp
{
    public static void main(String[] args) 
	{
        int a = 50, b=70, c=65;
		int d;
		{
			d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
			
			System.out.println("Largest Number:"+d);
		}
	}
}