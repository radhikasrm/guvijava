import java.util.*;
import java.lang.*;
import java.io.*;

public class negpos
{
	public static void main (String args[])
	{
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("To check whether the number is positve, negative or zero");
		System.out.println("Enter any number of your choice:0");
		i=s.nextInt();
		if(i>0)
		{
			System.out.println("The number is positive");
			
		}
		else if(i<0)
		{
			System.out.println("The number is negative");
		}
		else if(i==0)
		{
			System.out.println("The number is zero");
		}
		else
		{
			System.out.println("You have entered a wrong choice");
		}
	}
}
