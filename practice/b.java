
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
		   for(int j=0;j<t;j++){
		     String res="";
			 int n=sc.nextInt();
			 int k=sc.nextInt();
			 String s=sc.next();
			/* if(s.substring(0,1).equals("0")){
			 res+="1";
			 k--;
	        for(int i=1;i<s.length();i++)
			res+=s.charAt(i);
			System.out.print(res);
			 for(int l=k;l>=1;l--)
			 System.out.print("0");
			 }
			 else{
				for(int i=0;i<s.length();i++)
				res+=s.charAt(i);
				System.out.print(res);
				 for(int l=k;l>=1;l--)
			 System.out.print("0");
			 }
		   }*/			 
	}
	static int test(int n,int k,String s,String res){
		if(s.substring(0,1).equals("0")){
			res+="1";
			k--;
		}
		return test(n,)
	}
}