import java.util.ArrayList;
public class AccessingInArrayList {
     public static void main(String[] args) {
        
        ArrayList<String> cars = new ArrayList<String>();
        
        cars.add("Volvo");

        cars.add("Benz");

        cars.add("Audi");

        System.out.println(cars.get(0)); //accessing the element using get()

        System.out.println(cars.get(1));

        System.out.println(cars.get(2));

        System.out.println();

        for (String c : cars) {  //accessing elements using for each loop
            System.out.println(c);
        }

        System.out.println(cars.set(0 , "Ford")); //modifying the element using set()

        System.out.println(cars.get(0));

        System.out.println(cars.remove(1)); //remove particular element in the arraylist

        System.out.println(cars.size()); //return the size of the arraylist

        cars.clear(); //remove all the elements in the arraylist

        for(int i=0;i<cars.size();i++)
            System.out.println(cars.get(i));
    }
    
}
