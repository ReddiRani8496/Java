package student;

import java.util.Comparator;

public class SortByGPA implements Comparator<Student> {

    public int compare(Student a, Student b) {

        return Double.compare(b.getGpa(), a.getGpa());

    }
}

