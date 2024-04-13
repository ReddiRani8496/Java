package InnerClasses;
/*
static inner class is a class within another class.
static inner class can access only static variables and static methods of outer class.
static inner class can contain static and non-static variables and methods.
to create the object of static inner class, no need to create outer class object
 */
public class StaticInnerClass {
    static int a = 20;
    int b = 30;

    void msg() {
        System.out.println("Outer class non-static");
    }
    static void printMsg() {
        System.out.println("Outer class static");
    }

    static class InnerClass {
        int num = 30;
        static int num1 = 40;
        void display() {
            System.out.println(num);
            System.out.println(num1);
            System.out.println(a);
            //System.out.println(b); // cannot access non-static variables inside the static class
            //msg(); // cannot access outer class non-static methods
            printMsg();
        }
    }
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.display();
        System.out.println(InnerClass.num1);
    }
}
