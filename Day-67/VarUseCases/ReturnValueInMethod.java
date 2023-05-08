package VarUseCases;

public class ReturnValueInMethod {

    static int age() {
        var x = 20;
        return x;
    }
    public static void main(String[] args) {
        
        System.out.println(age());
    }
}
