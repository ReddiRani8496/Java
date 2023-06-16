// serialization is the process of converting an object state
// If we want to preserve, even the type of data, that can be done by using serialization
// static and transient are non-serializable

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

public class ObjectOutputStreamEx1 {
    public static void main(String[] args)  {
        SoftwareEngineer se = new SoftwareEngineer();
        se.name="john";
        se.age=24;
        se.weight=50.45;
        try {
            FileOutputStream fos = new FileOutputStream("john.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(se);
            long serialUId = ObjectStreamClass.lookup(se.getClass()).getSerialVersionUID(); // returns the unique id of the class
            System.out.println(serialUId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class SoftwareEngineer implements Serializable {
    String name;
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
