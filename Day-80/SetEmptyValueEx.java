import java.util.StringJoiner;

public class SetEmptyValueEx {
    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner("@");

      //  sj.add("Lion");

      //  sj.add("Tiger");

        sj.setEmptyValue("cheetah is the fastest land animal"); // if no elements have been added yet, then this content added to StringJoiner

        System.out.println(sj);

    }    
}
