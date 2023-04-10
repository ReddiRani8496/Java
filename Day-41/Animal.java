//program to illustrate the single inheritance
class Dog{
    String breed;
    double price;
    public void bark(){
        System.out.println("Dog is barking");
    }
    public void setBreed(String Breed){
        this.breed=Breed;
    }
    public String getBreed(){
        return this.breed;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }
}
public class Animal extends Dog {
    public void eat(){
        System.out.println("eating");
    }
    public static void main(String[] args) {
        Animal a=new Animal();
        a.setBreed("German");
        System.out.println(a.getBreed());
        a.setPrice(5000);
        System.out.println(a.getPrice());
        a.bark();
        a.eat();
       }
}

