//Variables defined inside a class and outside the method using satic keyword are called static variables

public class StaticVariable {

    static int a = 10;
    public static void main(String[] args) {
       System.out.println(a);  // we can access using variable name

       System.out.println(StaticVariable.a); //we can also access using classname.varablename
    }
}
