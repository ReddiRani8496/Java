public class ConstructorChaining {
    public static void main(String[] args) {
        
        Alarm alarm = new Alarm();
    }    
}

class Alarm {

    Alarm() {

        this(10);

        System.out.println("Finish your lunch");
    }

    Alarm(int a) {

        this(10,20);

        System.out.println("Go to work");
    }

    Alarm(int a, int b) {

        this(10, 20, 30);

        System.out.println("Finish your breakfast");
    }

    Alarm(int a, int b, int c) {

        System.out.println("wake up!!");
    }
    
}
