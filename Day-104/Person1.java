// Using records, a public constructor, with an argument for each field, is generated
public record Person1(String name, int age) { // by default record class is final

    public Person1( String name, int age) {

        this.name = name;

        this.age = age;

        System.out.println("new constructor");
    }

    public Person1(int age) {
        this(null,25);
        System.out.println("hi");
        //this(null,20);  constructor calling must be first statement

    }
    void  sayHi() {

        System.out.println("hi");
    }

    public static void hello() { // we can create static methods

        System.out.println("heloooo....");

    }
}
