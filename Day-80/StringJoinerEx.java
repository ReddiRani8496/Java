import java.util.StringJoiner;

public class StringJoinerEx {

    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner(" & ");

        sj.add("Welcome");

        sj.add("to");

        sj.add("Java");

        sj.add("programming");

        sj.add("world");

        System.out.println(sj);

        System.out.println(sj.length());

        StringJoiner sj1 = new StringJoiner("-","@","*");

        sj1.add("The");

        sj1.add("climate");

        sj1.add("is");

        sj1.add("too");

        sj1.add("hot");

        System.out.println(sj1);

        System.out.println(sj.equals(sj1));

        System.out.println(sj.getClass());

        System.out.println(sj1.merge(sj));
    }
}



