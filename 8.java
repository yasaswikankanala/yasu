/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,sum=0;
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		}
	}
