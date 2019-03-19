import java.util.*;
import java.lang.*;
import java.io.*;
class linecounts
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		int count=0,i;
		for(i=0;i<c.length();i++)
		{
			if(c.charAt(i)=='.')
			{
				count++;
			}
			count=count+1;
			System.out.println(count);
		}
	}
}
