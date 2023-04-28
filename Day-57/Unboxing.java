//Reverse of autoboxing, automatic conversion of object of the wrapper class to its primitive data type
public class Unboxing {
    public static void main(String[] args) {
        
        Integer num = 10; // Wrapper class object

        int num1 = num; // primitive type
        
        System.out.println(num1);

        Boolean b1 = true;

        boolean b = b1;

        System.out.println(b);

        Float f = 65.09f;

        float f1 = f;
        
        System.out.println(f1);

        Byte val = 87;

        byte val1 = val;

        System.out.println(val1);

    

    }
}
