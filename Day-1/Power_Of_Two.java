import java.util.Scanner;
public class Power_Of_Two{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the number:");
  int n=sc.nextInt();
  int count=0;
  /*while(n>0){
   n=n&(n-1);
   count++;
   }*/
   /*int mask=1;
   for(int i=0;i<31;i++){
   if((n&mask)!=0)
    count++;
   mask<<=1;
   }
   */
   while(n>0){
   if((n&1)==1)
    count++;
   n>>=1;
   }
   if(count==1)
    System.out.println("power of 2");
   else
    System.out.println("not a power of 2");
   }
  }
  
  