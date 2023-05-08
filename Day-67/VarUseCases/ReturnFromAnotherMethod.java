package VarUseCases;

public class ReturnFromAnotherMethod {

    static String hello() {

        var x = "hello";

        return x;
    }
    public static void main(String[] args) {

        var res = hello();

        System.out.println(res);
        
    }   
}
