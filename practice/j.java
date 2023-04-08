/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		if(r>=1&&r<=50)
		System.out.println(100*100/100);
		else if(r>=51&&r<=100)
		System.out.println((100*50)/100);
		else
		System.out.println("0");
	}
}
