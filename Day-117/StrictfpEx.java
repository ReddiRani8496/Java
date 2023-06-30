public class StrictfpEx {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(mul());
     //   strictfp int a =10; // compile-time error, strictfp can't be used for variables
    }
    static strictfp double sum() { // strictfp can be used for methods
        double num1 = 10.34444444;
        double num2 =20.345454;
        return  num1+num2;
    }
    static  strictfp double mul() {
        double num1 = 10e+10;
        double num2 = 6e+08;
        return num1 * num2;

    }
}
