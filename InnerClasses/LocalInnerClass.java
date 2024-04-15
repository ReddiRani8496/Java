package InnerClasses;

public class LocalInnerClass {
    public static void main(String[] args) {

        // Inner i = new Inner(); // the scope of local inner class is within the method
        // i.show();
    }

    public void display(int a){

        class Inner{
            
            void show(){
                System.out.println("Hello");
                System.out.println(a);
            }
        }
        
        Inner i = new Inner();
        i.show();
    }
}
