import java.util.Scanner;

public class leapyear 
{
		public static void main (String args[])
		{
			int i;
			System.out.println("Find out the leap year");
			Scanner s=new Scanner (System.in);
			System.out.println("Enter an year:");
			i=s.nextInt();
			if(i%4==0)
			{
				System.out.println("The entered year is a leap year");
			}
			else
			{
				System.out.println("The entered year is not a leap year");
			}
			
		}
		

}
