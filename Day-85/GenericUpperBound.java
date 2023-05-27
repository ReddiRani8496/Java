import java.util.ArrayList;
import java.util.List;

public class GenericUpperBound {
    public static void main(String[] args) {
        
        List<Animal> list = new ArrayList<>();
        
        Animal a1 = new Animal("Lion");
        
        list.add(a1);
        
        Dog d1 = new Dog("Max");
        
        list.add(d1);
        
        Samoyed s1 = new Samoyed();
        
        list.add(s1);
        
        System.out.println(list);



    }
    public  static void printDetails(List<? extends  Animal> t) {
        
        System.out.println(t);
    }
    }
    class Animal {
        String name;

        public Animal(String name) {
            
            this.name = name;
        }
        Animal() {

        }

        @Override
        public String toString() {
            
            return name;
        }
    }
    class Dog extends Animal {
        String name;

        Dog(String name) {
            
            this.name = name;
        }
        Dog() {

        }

        @Override
        public String toString() {
            
            return name;
        }
    }
    class Samoyed extends  Dog {
        @Override
        public String toString() {
            return "Samoyed";
        }
    }










