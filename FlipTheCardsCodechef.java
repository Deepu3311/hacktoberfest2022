/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		     if(n==x||x==0)
		     {
		         System.out.println(0);
		     }
		     else{
		         int y= n-x;
		         if(x>y)
		         {
		             System.out.println(y);
		         }
		         else{
		             System.out.println(x);
		         }
		     }
		}
	}
	}
