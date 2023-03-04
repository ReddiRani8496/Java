//program to caluculate the HCF of two numbers
import java.util.Scanner;
class HCF_Of_2Numbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int firstNumber=sc.nextInt();
        System.out.print("Enter the second number:");
        int secondNumber=sc.nextInt();
        int result=1;
        for(int i=Math.min(firstNumber,secondNumber);i>=1;i--){
            if((firstNumber%i==0)&&(secondNumber%i==0)){
                result =i;
                break;
            }
        }
        System.out.println(result);
    }
}