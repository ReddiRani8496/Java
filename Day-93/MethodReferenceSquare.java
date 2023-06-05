@FunctionalInterface
interface SquareRoot{

    double square(double root);

}

public class MethodReferenceSquare {
    public static void main(String[] args) {

        SquareRoot squareRoot = Math::sqrt;
       
        double res = squareRoot.square(4);
        
        System.out.println(res);
    }
}
