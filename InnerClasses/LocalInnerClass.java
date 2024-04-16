package InnerClasses;

public class LocalInnerClass {
    static int num =5;
    static final int num1 =20;
    public static void main(String[] args) {
        
        // Inner i = new Inner(); // the scope of local inner class is within the method
        // i.show();
    }

    public void display(int a){

        class Inner{
            
            void show(){
                System.out.println("Hello");
                System.out.println(a);
                System.out.println(num);
                System.out.println(num1);
            }
        }
        
        Inner i = new Inner();
        i.show();
    }
}
