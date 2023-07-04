import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapEx { 
    public static void main(String[] args) {
        Dog a = new Dog();
        a.age = 11;
        a.breed = "";

        Dog a1 = new Dog();
        a1.age =5;
        a1.breed = "deer";

        List<Dog> list = List.of(a,a1);


        Map<Integer,List<Dog>> map = new HashMap<>();
        map.put(1,list);
        map.put(2,list);

        System.out.println(map);
        System.out.println(map.get(2).get(0).breed);

    }
}
class Dog {

    int age;
    String breed;


    @Override
    public String toString() {
        return "Animal [age=" + age + ", name=" + breed + "]";
    }


}
