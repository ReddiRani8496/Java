public class ArithmeticOperations {
    static int num1 = 10;
    static int num2 =20;
    static void sum(){
        System.out.println(num1 + num2);
    }
    static void sub() {
        System.out.println(num1 - num2);
    }
    static void mul() {
        System.out.println(num1 * num2);
    }
    static void div() {
        System.out.println(num1 / num2);
    }
    static void modulous() {
        System.out.println(num1 % num2);
    }
    public static void main(String[] args) {
        sum();
        sub();
        mul();
        div();
        modulous();
    }
}
