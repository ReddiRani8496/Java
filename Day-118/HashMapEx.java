import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapEx { 
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.age = 3;
        dog1.breed = "German Shepherd";

        Dog dog2 = new Dog();
        dog2.age =2;
        dog2.breed = "Chow Chow";

        List<Dog> list = List.of(dog1,dog2);


        Map<Integer,List<Dog>> map = new HashMap<>();
        map.put(1,list);
        map.put(2,list);

        System.out.println(map.get(2).get(0).breed);

    }
}
class Dog {

    int age;
    String breed;

}
