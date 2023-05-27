public class PassOrFail {
    public static void main(String[] args) {

       Student<Integer,Boolean> john = new Student<>(40 ,true);

       Student<Integer,Boolean> king = new Student<>(29,false);

        System.out.print(john.getMarks()+" ");

        System.out.println(john.isPass());

        System.out.print(king.getMarks()+" ");

        System.out.println(king.isPass());
    }
}
class Student<E,V> {

    E marks;

    V isPass;

    Student(E marks, V isPass) {

        this.marks = marks;

        this.isPass = isPass;
    }

    E getMarks() {

        return this.marks;
    }

    V isPass() {
        
        return this.isPass;
    }
}
