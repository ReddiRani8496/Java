import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello";
        String str1 = "Hello";
        boolean res = str == str1; // compares the address
//        switch (res) { // cannot pass boolean to switch
//            case true:
//                System.out.println("Both equal");
//            case false:
//                System.out.println("Both are not equal");
//        }
        System.out.println(res); // returns true, both the string literals created inside the string pool
                                // and pointing to the same address
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());

        String str2 = sc.next();
        System.out.println(str==str2); // returns false, if both str and str2 have same value, str2 is created outside string pool

        String str3 = new String("Hello");
        System.out.println(str == str3); // str3 created outside the string pool, == compares address
        System.out.println(str.equals(str3)); // returns true compares the values
    }
}
