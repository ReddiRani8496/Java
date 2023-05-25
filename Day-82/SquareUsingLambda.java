public class SquareUsingLambda {
    
    public static void main(String[] args) {

        Square res = (x) -> {

            return x*x;

        };

       System.out.println(res.square(10));
    }
}

interface Square {
    
    int square(int x);
}


