import java.util.Arrays;

public class GenericArray {
    public static void main(String[] args) {

        WildAnimals<String> wildAnimals = new WildAnimals<>();

        wildAnimals.addWildAnimals(0,"Lion");

        wildAnimals.addWildAnimals(1,"Tiger");

        wildAnimals.addWildAnimals(2,"Panther");

        wildAnimals.addWildAnimals(3,"Deer");

        wildAnimals.addWildAnimals(4,"Rhinoceros");

        wildAnimals.addWildAnimals(5,"Panda");

        wildAnimals.addWildAnimals(6,"Giraffe");
        
        wildAnimals.addWildAnimals(7,"Crocodile");
   
        System.out.println(wildAnimals);
    }

}

class WildAnimals<E> {

    Object[] name;

    public WildAnimals() {

        name = new Object[8];
    }
    void addWildAnimals(int ind,E Names) {

        name[ind] = Names;
    }

    @Override
    public String toString() {

        return Arrays.toString(name);
    }
}
