import java.util.Arrays;

public class OOPThinking1 {

    public static void main(String[] args) {

        Human h1 = new Human();
        h1.setName("Reddirani");
        h1.setAge(22);
        h1.setGender(Gender.FEMALE);
        Cars c1 = new Cars();
        c1.setBrand("Ford");
        c1.setMileage(17);
        c1.setSeatingCapacity(6);
        c1.setHavingAC(true);
        c1.setPrice(15_00_000);

        Cars c2 = new Cars();
        c2.setBrand("Audi");
        c2.setMileage(14);
        c2.setSeatingCapacity(5);
        c2.setHavingAC(false);
        c2.setPrice(12_00_000);

        Cars cars[] = {c1,c2};
        h1.setCars(cars);

        Dog d1 = new Dog();
        d1.setName("Max");
        d1.setSpeed(18.43);

        Cats c = new Cats();
        c.setName("Charlie");
        c.setSpeed(11.34);

        Object pets[] = {d1,c};
        h1.setPets(pets);

        House house1 = new House();
        house1.setLength(12.43);
        house1.setWidth(10.23);

        House house2 = new House();
        house2.setWidth(15.87);
        house2.setHeight(13.76);

        House house[] = {house1,house2};
        c.setHouse(house);


        Servents s = new Servents();
        s.setName("Radhika");
        s.setAge(27);
        s.setEducations("Intermediate");
        s.setSalary(30000);
        s.setShift(SHIFT.MORNING);

        Servents s1 = new Servents();
        s1.setName("Tillu");
        s1.setAge(28);
        s1.setEducations("10th");
        s1.setSalary(24000);
        s1.setShift(SHIFT.NIGHT);

        Servents servents[] = {s,s1};
        h1.setServents(servents);

        h1.eating();
        h1.sleeping();

        System.out.println(h1);



    }
}

class Human {

    private String name;
    private int age;
    Gender gender;

    Cars[] cars;
    Object[] pets;
    Servents[] servents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Cars[] getCars() {
        return cars;
    }

    public void setCars(Cars[] cars) {
        this.cars = cars;
    }

    public Object[] getPets() {
        return pets;
    }

    public void setPets(Object[] pets) {
        this.pets = pets;
    }

    public Servents[] getServents() {
        return servents;
    }

    public void setServents(Servents[] servents) {
        this.servents = servents;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", cars=" + Arrays.toString(cars) +
                ", pets=" + Arrays.toString(pets) +
                ", servents=" + Arrays.toString(servents) +
                '}';
    }
    void eating() {
        System.out.println("Time to eat..");
    }
    void sleeping() {
        System.out.println("8hrs sleeping is good for health");
    }
}
enum Gender {
    MALE,FEMALE;
}
