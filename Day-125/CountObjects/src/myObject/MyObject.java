package myObject;

public class MyObject {
    static int count;
    int serialNo=0;
    public MyObject() {

        count++;

        serialNo = count;

    }
    public   void display() {

        System.out.println("I am object number: " + serialNo);

    }
    public static int getCount() {
        return count;
    }
}
