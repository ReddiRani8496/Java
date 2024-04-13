package InnerClasses;
public class AnonymousInnerClass {
    public static void main(String args[]) {
    
        new Rock() {
            @Override
            public void mock() { 
                System.out.println("mock");
            }
        }.mock();
        }
}

@FunctionalInterface
interface Rock{
    void mock();
}
