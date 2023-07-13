public class Main {

    public static void main(String[] args) {

        Marks marks = new Marks();

        marks.in();

        int totalMarks = marks.sum();
        System.out.println("\nSum of marks: "+totalMarks);

        String averageMarks = marks.avg();
        System.out.println("\nAverage marks: "+averageMarks);

    }

}
