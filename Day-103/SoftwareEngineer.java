import java.io.Serializable;

class SoftwareEngineer implements Serializable {
    static String name;
    transient int age; // if we use transient for variable,it is not serializable, it will return the default value
    static double weight; // while we use static variables, they are not serializable,returns default value

    void sayHi() {
        System.out.println("hi "+this.name);
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

