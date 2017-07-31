import java.util.Scanner;

class PrimeExample{  
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Please enter the Number to check if it is a Prime Number or not");
int num = sc.nextInt();
int i;
m=num/2;    
for(i=2;i<=m;i++)
{    
if(n%i==0)
{    
System.out.println("Number is not prime");       
}    
}    
else   
System.out.println("Number is prime");    
}  
}  