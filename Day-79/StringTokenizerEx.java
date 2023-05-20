import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("welcome@toprogramming@world", "@");

        System.out.println(st.countTokens());

        while(st.hasMoreTokens()) {

            System.out.println(st.nextToken());
        }

        StringTokenizer str = new StringTokenizer("hello-world-rock-the-day");

        while(str.hasMoreTokens()) {
            
            System.out.println(str.nextToken("-"));
        }
    }
}
