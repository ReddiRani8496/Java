import java.util.*;
public class PassingObjectToArrayList {
    public static void main(String[] args) {

        ArrayList<Dog> arrayList = new ArrayList<>(); // passing object to ArrayList

        Dog[] list = new Dog[3];

        Dog d1 = new Dog();

        d1.breed = "Pomeranian";

        d1.price = 8000.00;

        Dog d2 = new Dog();

        d2.breed = "Samoyed";

        d2.price = 10000.00;

        list[0]=d1;

        list[1]=d2;

        System.out.println(Arrays.toString(list));

        arrayList.add(d1);

        arrayList.add(d2);

        System.out.println(arrayList);
    }
}
class Dog {
    String breed;
    double price;
    @Override
    public String toString() {

        return "breed: "+breed+" price: "+price;
    }
}