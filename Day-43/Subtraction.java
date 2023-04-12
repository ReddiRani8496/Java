public class Subtraction {
    public static void main(String[] args) {
        Sub.Sub1 s=new Sub.Sub1();
        s.sub1();

    }
}
 class Sub{
    int x=10;
    static int x1=10;
    public static class Sub1{
       static int y=5;
       static void sub1(){
            //System.out.println(x-y);//we cannot access x because non static variable cannot be accessed in a static class
            System.out.println(x1-y);//we can access x1 since x1 and sub1 class is static
        }
    }
}