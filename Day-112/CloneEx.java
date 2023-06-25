// clone method is use to copy the values avaliable in clonable interface

public class CloneEx {
    public static void main(String[] args) throws CloneNotSupportedException {

        Subtraction s = new Subtraction();
        s.a = 10;
        s.b = 20;

        Subtraction s1 = (Subtraction) s.clone();

        System.out.println(s1.a);
        System.out.println(s1.b);

    }


}
class Subtraction implements Cloneable { // cloneable is a marker interface

    int a;
    
    int b;

    @Override
    public Object clone() throws CloneNotSupportedException {
    
        return super.clone();
        
    }
}

