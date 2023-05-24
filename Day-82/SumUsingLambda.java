public class SumUsingLambda {
    
    public static void main(String[] args) {

        Sum res = (a,b) -> {

                System.out.println(a+b);


        };

        res.sum(10,20);
    }
}

interface Sum {
    
    void sum(int a, int b);
}

