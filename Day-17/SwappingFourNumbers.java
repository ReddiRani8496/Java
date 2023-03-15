/*program to swap three numbers
a=10 b=20 c=30 d=40
after swapping
a=40 b=10 c=20 d=30
*/
class SwappingFourNumbers{
    public static void main(String[] args){
        int a=10,b=20,c=30,d=40;
        System.out.println("Before swapping a="+a+" b="+b+" c="+c+" d="+d);
        a=a+b+c+d;
        b=a-b-c-d;
        c=a-b-c-d;
        d=a-b-c-d;
        a=a-b-c-d;
        System.out.println("After swapping a="+a+" b="+b+" c="+c+" d="+d);
    }
}