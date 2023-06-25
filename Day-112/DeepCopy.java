public class DeepCopy {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.a = 10;
        s.b = 20;
        Sub s1 = new Sub();
        s1.a=s.a;
        s1.b=s.b;
        System.out.println(s1.a);
        System.out.println(s.a);
        s1.a=100;
        System.out.println(s1.a);
        System.out.println(s.a); // here the changes made in object will not reflect on other object
                                 // it is difficult to back up every value and takes time
    }
}
class Sub{
    int a;
    int b;
}
