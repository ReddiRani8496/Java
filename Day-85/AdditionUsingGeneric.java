public class AdditionUsingGeneric {
    public static void main(String[] args) {
        
        /*Addition addition = new Addition();
        addition.add(10, 20);
        addition.add(20435465l, 3079807834l);
        addition.add(54.34,908.43);
        addition.add(43.345f, 345.45f);*/

        Addition addition = new Addition();

        System.out.println(addition.add(10,20));

        System.out.println(addition.add(11.454,65.65));

        System.out.println(addition.add(455.4f, 344.34f));

        System.out.println(addition.add(32443l, 43433l)); 
    }
}
class Addition {

   /*  public void add(int a, int b) {
        System.out.println(a+b);
    }
    public void add(long a, long b) {
        System.out.println(a+b);
    }
    public void add(float a, float b) {
        System.out.println(a+b);
    }
    public void add(double a, double b) {
        System.out.println(a+b);
    } */ // Repeating the same method multiple times, this can be avoided by using generics
    public <T extends Number> double add(T one, T two) {
        
        return one.doubleValue() + two.doubleValue();
    }
}

