import java.util.Scanner;

public class grades
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the marks you have got to check the corresponding grade");
int marks = sc.nextInt();

if(marks>80 && marks<100)
{
System.out.println("Congratulations, You have got Grade A+");
}
	else if(marks>70 && marks<80)
	{
	System.out.println("Congratulations, You have got Grade A");
	}
		else if(marks>50 && marks<70)
		{
		System.out.println("Buck up, You have got Grade B");
		}
			else if(marks>40 && marks<50)
			{
			System.out.println("Start Practicing more, You have got Grade C");
			}
				else if(marks>33 && marks<40)
				{
				System.out.println("You need to study hard, You have got Grade D");
				}
					else
					{
					System.out.println("Sorry you have failed. Please reappear for exam again");
					}
}
}