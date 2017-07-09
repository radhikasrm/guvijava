import java.util.Scanner;
public class sum 
{
	public static void  main(String args[])
	{
		System.out.println("To calculate the sum of Natural numbers!");
		
			
				int sum = 0;
				int i;
				Scanner s=new Scanner(System.in);
				System.out.println("Enter any  number:");
				i=s.nextInt();
				
				for(int j = 1;j <= i;j++)
				{
					sum = sum + j;
				}
				System.out.println("The Sum Of "+i+" Numbers are:" + sum);
			
		
	}
}
