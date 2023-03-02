//program to find read 10 numbers from keyboard and find their sum and average
import java.util.Scanner;
class Sum_and_Average{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=0,sum=0;
      double avg=0;
      System.out.println("enter 10 numbers:");
      for(int i=1;i<=10;i++){
       n=sc.nextInt();
        sum=sum+n;
      }
    System.out.println("Sum of 10 numbers is: "+sum);
    System.out.println("Average of 10 numbers is: "+(sum/n));
}
}