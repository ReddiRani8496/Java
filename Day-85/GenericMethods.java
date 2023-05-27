public class GenericMethods {
    public static void main(String[] args) {

       details("john", 45000);

       details("King", 6500.50); 

       details("David", 89000.75f);

    }

    public static<T> void details(T name, T fee) {

        System.out.println("Name: "+name+"\tfee:"+fee);
        
    }

    /* public static void details(String name , int fee){

    }
    public static void details(String name, double fee){

    } */ // repeating the same code with different datatypes, this can be avoided by using generic methods
}

