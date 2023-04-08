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
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int k=sc.nextInt();
		    int arr[]=new int[n];
		    for(int j=0;j<n;j++)
		    arr[j]=sc.nextInt();
		    for(int j=0;j<arr.length;j++){
		        if(arr[0]!=1){
		        arr[0]=1;
		        k--;
		        }
		        
		        System.out.print(arr[j]);
		      
		    }
		    for(int m=1;m<=k;m++)
		    System.out.print("0");
		}
	}
}
