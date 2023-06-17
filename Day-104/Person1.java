// Using records, a public constructor, with an argument for each field, is generated
public record Person1(String name, int age) { // by default record class is final
    void  sayHi() {

        System.out.println("hi");

    }
}
