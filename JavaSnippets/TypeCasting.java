public class TypeCasting {
    public static void main(String[] args) {
        int a = 10;
        double b = a;
      //  int c = b; possible lossy conversion from double to int
        double d = 20;
        System.out.println(a/d); // 0.5
        System.out.println(d/a); //2.0
    }
}

