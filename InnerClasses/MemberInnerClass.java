package InnerClasses;

/*
member inner class is a class within another class.
member inner class can access all variables and  methods of outer class.
member inner class can contain static and non-static variables and methods.
to create the object of member inner class, we need to create the outer class object
 */
public class MemberInnerClass {
    static int a = 20;
    int b = 20;
    void msg() {
        System.out.println("Outer class non-static");
    }
    static void printMsg() {
        System.out.println("Outer class static");
    }

    class InnerClass {
        static int num = 20;
        int num1 = 30;
        void display() {
            System.out.println(num1);
            System.out.println(num);
            System.out.println(a);
            System.out.println(b);
            msg();
            printMsg();
        }
    }
    public static void main(String[] args) {
        MemberInnerClass m = new MemberInnerClass();
        MemberInnerClass.InnerClass innerClass = m.new InnerClass();
        innerClass.display();
    }
}

