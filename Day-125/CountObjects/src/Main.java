import myObject.MyObject;

public class Main {

    public static void main(String[] args) {

        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();
        MyObject obj3 = new MyObject();

        obj1.display();
        obj2.display();
        obj3.display();

        System.out.println(MyObject.getCount());
        
    }
}

/*
Create a class that includes a data member that records a count of how many objects have
been created so far. (This member should be applied to the class as a whole; not to individual
objects. What keyword specifies this?) Then, as each object is created, its constructor can
examine this count member variable to determine the appropriate serial number for the new
object. Add a member function that permits an object to report its own serial number.
Write main() program that creates three objects and queries each one about its serial number.
They should respond I am object number 2, and so on.
 */