public class LocalVariable {

    void add(){
        int a=10; //local variable, scope within the add method
        int b=20;
        System.out.println(a+b);
    }

    LocalVariable(int a, int b){
        System.out.println(a-b); // local variable, scope within the constructor
    }
    public static void main(String[] args) {
        
        int a=10; //local variable, scope within the main method

        System.out.println(a);

        LocalVariable variable = new LocalVariable(20,10);
        
        variable.add();

        

    }
}