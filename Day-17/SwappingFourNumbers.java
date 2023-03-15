/*program to swap three numbers
a=10 b=20 c=30 d=40
after swapping
a=40 b=10 c=20 d=30
*/
class SwappingFourNumbers{
    public static void main(String[] args){
        int a=10,b=20,c=30,d=40;
        System.out.println("Before swapping a="+a+" b="+b+" c="+c+" d="+d);
        d=a+b+c+d;
        a=d-a-b-c;
        b=d-b-c-a;
        c=d-a-b-c;
        d=d-a-b-c;
        System.out.println("After swapping a="+a+" b="+b+" c="+c+" d="+d);
    }
}