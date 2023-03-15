/*program to swap three numbers
a=10 b=20 c=30
after swapping
a=30 b=10 c=20
*/
class SwappingThreeNumbers{
    public static void main(String[] args){
        int a=10,b=20,c=30;
        System.out.println("Before swapping a="+a+" b="+b+" c="+c);
        a=a+b+c;
        b=a-b-c;
        c=a-b-c;
        a=a-b-c;
        System.out.println("After swapping a="+a+" b="+b+" c="+c);
    }
}