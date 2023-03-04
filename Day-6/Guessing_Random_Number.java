//program to generate random number and ask the user to guess the number, if guess is greater than number print "too high",if less print"too low",otherwise "correct"
import java.util.Scanner;
class Guessing_Random_Number{
   public static void main(String[] args){
    int n=(int)(Math.random()*100);
    
    Scanner sc=new Scanner(System.in);
    int guess;
    do{
        System.out.println("guess the number:");
        guess=sc.nextInt();
        if(n<guess)
         System.out.println("too high");
        else if(n>guess)
         System.out.println("too low");
        else
         System.out.println("Amazing, you guessed correctly");
    }while(guess!=n);
     }
}