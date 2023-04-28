//Variables declare inside a class and outside the method are called instance variables

public class InstanceVariable {

    int a=10; //instance variable
    public static void main(String[] args) {
        
        InstanceVariable variable = new InstanceVariable(); //1st copy of memory created

        System.out.println(variable.a); 

        InstanceVariable variable1 = new InstanceVariable(); //2nd copy of memory created

        System.out.println(variable1.a);

        variable.sub();

    }
    void sub(){
        int b=20;
        System.out.println(a-b); //instance variable can be accessed within the class
    }
}
