//program to find the maximum of two numbers using method reference
@FunctionalInterface
interface MaxOfTwo{

    double maximum(double x,double y);

}
public class MethodReferenceMax {
    public static void main(String[] args) {

        MaxOfTwo maxOfTwo = Math::max;

        double res =maxOfTwo.maximum(10, 20);
        
        System.out.println(res);

    }
    
}
