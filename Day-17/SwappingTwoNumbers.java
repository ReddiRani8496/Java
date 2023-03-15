/* program to swap two numbers, 
before swapping a=10, b=20
 after swapping a=20,b=10
 */

 class SwappingTwoNumbers{
    public static void main(String[] args){
        int a=10,b=20;
        System.out.println("Before swapping a="+a+" b="+b);
        //by using temp variable
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping a="+a+" b="+b);

        //without using temp variable
        int c=10,d=20;
           System.out.println("Before swapping c="+c+" d="+d);
        c=c+d;
        d=c-d;
        c=c-d;
           System.out.println("after swapping c="+c+" d="+d);
    }
 }