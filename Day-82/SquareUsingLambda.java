public class SquareUsingLambda {
    
    public static void main(String[] args) {

        Square res = (x) -> {

            System.out.println(x*x);

            

        };

        res.square(10);
    }
}

interface Square {
    
    void square(int x);
}


