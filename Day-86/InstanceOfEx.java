public class InstanceOfEx {
    public static void main(String[] args) {

        University university = new Mca();

        System.out.println(university.strength); // returns strength of university

        if(university instanceof Mca) {

            Mca mca = (Mca) university; // downcasting

            System.out.println(mca.strength);
        }
        
    }
}

class University {
    
    int strength = 3000;

}

class Mca extends University {

    int strength = 200;
}
