public class InitializerBlockEx2 {
    public static void main(String[] args) {
        
       Car c1 = new Car(); 

       Car c2 = new Car();
    }    
}
class Car {

    static {

        System.out.println("static block"); //it runs only once when a class is loaded into memory
    }
   
    Car() {

        System.out.println("Empty constructor"); //It runs every time whenever the object is created
    }

    {
        
        System.out.println("Initializer block"); // It runs every time whenever the object is created
    }
}

/*
 * static block is called first 
 * Initializer block is called next
 * Finally, constructor is called
 */
