public class Main {
    static int count;
    public Main() {

        count++;
        
    }
    private  int getSerialNumber() {

        return count;

    }
    public static void main(String[] args) {

        Main main1 = new Main();
        Main main2 = new Main();
        Main main3 = new Main();

        System.out.println("I am object number "+main1.getSerialNumber());
        System.out.println("I am object number "+main2.getSerialNumber());
        System.out.println("I am object number "+main3.getSerialNumber());

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