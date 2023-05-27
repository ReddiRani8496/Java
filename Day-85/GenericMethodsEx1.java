public class GenericMethodsEx1 {
    public static void main(String[] args) {

        Integer JohnMarks[] = {80,45,97,38};

        var x = printDetails("John", JohnMarks);

        System.out.println(x);

        Double KingMarks[] = {67.98, 45.32,99.55};

        var y = printDetails("King", KingMarks);

        System.out.println(y);
    }

    public static <T,K> T printDetails(T name, K[] marks) {

        System.out.println("Name: "+name);

        for (K markss : marks)

            System.out.println(markss+" ");
            
        System.out.println();

        return (T) (name+" Section A");
    }
}

