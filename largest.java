import java.util.*;
public class largest 
{
	public static void main(String args[])
	{
		System.out.println("Find the largest number");
		int a,b,c;
		int large;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number:");
		a=s.nextInt();
		System.out.println("Enter the second  number:");
		b=s.nextInt();
		System.out.println("Enter the third number:");
		c=s.nextInt();
		large=a;
		if(b>large)
		{
			large=b;
		}
		if(c>large)
		{
			large=c;
		}
		System.out.println("\n The largest number is:"+large);
	}
}
