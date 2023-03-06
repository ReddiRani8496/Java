import java.util.Scanner;
class functions{
    static void caluculator(int a,int b){
        int add=a+b;
        System.out.println("addition="+add);
        int sub=a-b;
        System.out.println("subtraction="+sub);
        int mul=a*b;
        System.out.println("multiplication="+mul);
        double div=a/b;
        System.out.println("division="+div);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();
        caluculator(a,b);

    }
}