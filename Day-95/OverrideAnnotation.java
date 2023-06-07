public class OverrideAnnotation {
    public static void main(String[] args) {
        
        Nick nick = new Nick();
        
        nick.showman();
    }   
}

class Nick{

    void showman() {

        System.out.println("Nick");

    }
}

class Duck extends Nick {

    @Override
    void showman() { // here we are overriding the method, so it is decided at the runtime which method has to call,
                     // it takes more time as compared to method overloading, because we have to check everytime when we run the program

        System.out.println("Duck");
    }
}
