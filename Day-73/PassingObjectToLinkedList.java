//program to pass object as generic to the LinkedList.

import java.util.*;

class PassingObjectToLinkedList {
    public static void main(String[] args) {

        LinkedList<Duck> linkedList = new LinkedList<>();

        Duck d1 = new Duck();

        d1.age = 21;

        d1.weight = 24.80;

        Duck d2 = new Duck();

        d2.age = 10;

        d2.weight = 10.30;

        linkedList.add(d1);

        linkedList.add(d2);

        System.out.println(linkedList); // if we don't override toString() it returns address of objects, otherwsie returns the values.

        System.out.println(linkedList.toString());

    }
}
class Duck{
    int age;

    double weight;

    @Override
    public String toString() {
        
        return "age "+age+" weight "+weight;
    }
}