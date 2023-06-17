import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Person1 p = new Person1("John",24); // we can create object for record, same as class object

        p.sayHi();

        System.out.println(p.age());

    }
}
//class Person2 extends Person1{} we cannot extend record class
 class Person {

    private  String name;
    private  int age;

    Person(){

    }
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof Person person)) return false;
         return getAge() == person.getAge() && Objects.equals(getName(), person.getName());
     }

     @Override
     public int hashCode() {
         return Objects.hash(getName(), getAge());
     }

     @Override
     public String toString() {
         return "Person{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 '}';
     }
 }