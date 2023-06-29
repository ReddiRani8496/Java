import java.util.Optional;

import static java.lang.Math.random;

public class OptionalClass {
    public static void main(String[] args) {
        String rock = null;
       // String result = randomString();
       // System.out.println(result.length()); // code crashes i.e., the code has stopped due to exception or error,
                                               // this can be handled by using optional class
        Optional<String> result = randomString();
        System.out.println(result.toString().length());
    }
    public static Optional<String> randomString() {
        if(Math.floor(random()*5)==4)
            return null;
        else
            return Optional.ofNullable(("rock"));
    }
}
