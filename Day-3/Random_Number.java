//program to print random number between 100 to 1000
import java.lang.Math;
class Random_Number{
 public static void main(String[] args){
  int min=100;
  int max=1000;
  System.out.println("Random value between "+min+" to "+max+" :");
  int c=(int)(Math.random()*(max-min+1)+min);
  System.out.println(c);
  }
  }