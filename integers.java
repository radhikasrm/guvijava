import java.util.*;

public class integers 
{
	public static void main(String args[])
	{
		String i;
		Scanner s=new Scanner(System.in);
		System.out.println("Program to count the number of digits! \nEnter your choice:");
		i=s.nextLine();
		int num_count = 0;
		for (int j = 0 ;j<i.length();j++) 
		{
		    if (Character.isDigit(i.charAt(j))) 
		    {
		    	num_count++;
		    }
		
		}
		System.out.println("The numbers in the message are:"+num_count);
	}

}
