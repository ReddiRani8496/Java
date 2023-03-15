/*program to swap three numbers
a=10 b=20 c=30
after swapping
a=20 b=30 c=10
*/
class SwappingThreeNumbers{
    public static void main(String[] args){
        int a=10,b=20,c=30;
        System.out.println("Before swapping a="+a+" b="+b+" c="+c);
        b=a+b+c;
        a=b-a-c;
        c=b-a-c;
        b=b-a-c;
        System.out.println("After swapping a="+a+" b="+b+" c="+c);
    }
}