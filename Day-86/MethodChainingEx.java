public class MethodChainingEx {
    public static void main(String[] args) {

        String country = "India";

        boolean res = country.toUpperCase().isEmpty(); // chaining predefined methods

        System.out.println(res);

        boolean res1 = country.replace("I","i").startsWith("I");
        
        System.out.println(res1);
    }    
}
