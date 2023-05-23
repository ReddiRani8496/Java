/* With the help of static import, we can access the static members of a class directly
    without any class name or any object.
*/ 


import static java.lang.Math.*;

class StaticImportEx {
    public static void main(String[] args) {

        System.out.println(abs(-500));

        System.out.println(round(23.45));

        System.out.println(ceil(2.6));

        System.out.println(floor(3.6));

        System.out.println(sqrt(5));

        System.out.println(pow(3,2));

        System.out.println(min(10,20));

        System.out.println(max(20, 30));
    }
}